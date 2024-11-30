package com.discoverit.app;

import com.discoverit.app.controller.PostController;
import com.discoverit.app.model.Post;
import com.discoverit.app.repository.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PostController.class)
@AutoConfigureMockMvc
public class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PostRepository postRepository;

    private Post post; // Test post object

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
        post = new Post("Test Title", "Test Content"); // Create a sample post
        post.setId(1L); // Set a sample ID for the test post
    }

    @Test
    public void testGetAllPosts() throws Exception {
        when(postRepository.findAll()).thenReturn(Arrays.asList(post)); // Mock finding all posts

        mockMvc.perform(get("/api/posts"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].title").value("Test Title"))
                .andExpect(jsonPath("$[0].content").value("Test Content"));
    }

    @Test
    public void testGetPostById() throws Exception {
        when(postRepository.findById(1L)).thenReturn(Optional.of(post)); // Mock finding the post

        mockMvc.perform(get("/api/posts/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Test Title"))
                .andExpect(jsonPath("$.content").value("Test Content"));
    }

    @Test
    public void testGetPostByIdNotFound() throws Exception {
        when(postRepository.findById(1L)).thenReturn(Optional.empty());

        mockMvc.perform(get("/api/posts/1"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testCreatePost() throws Exception {
        when(postRepository.save(any(Post.class))).thenReturn(post); // Mock saving the post

        mockMvc.perform(post("/api/posts")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":\"Test Title\", \"content\":\"Test Content\"}"))
                .andExpect(status().isCreated())  // Expect 201 Created
                .andExpect(jsonPath("$.title").value("Test Title"))
                .andExpect(jsonPath("$.content").value("Test Content"));
    }

    @Test
    public void testDeletePost() throws Exception {
        // Prepare mock behavior for finding the post by ID
        when(postRepository.findById(1L)).thenReturn(Optional.of(post)); // Mock finding post

        // Perform DELETE request for the post
        mockMvc.perform(delete("/api/posts/1"))
                .andExpect(status().isNoContent()); // Expect 204 No Content

        // Verify that the delete method was called on the repository
        verify(postRepository, times(1)).delete(post); // Verify delete was called once
    }

    @Test
    public void testDeletePostNotFound() throws Exception {
        // Prepare mock behavior when the post is not found for deletion
        when(postRepository.findById(1L)).thenReturn(Optional.empty());

        // Perform DELETE request and expect 404 Not Found
        mockMvc.perform(delete("/api/posts/1"))
                .andExpect(status().isNotFound());
    }
}
