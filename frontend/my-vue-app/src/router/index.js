import {createRouter, createWebHashHistory} from "vue-router";
import MainPage from "../views/MainPage.vue";
import RegisterPage from "../components/RegisterForm.vue"; // Create this view for the register page
import LoginPage from "../components/LoginForm.vue";
import PostPage from "../components/PostsForm.vue"// Create this view for the login page

const routes = [
    {
        path: "/",
        name: "MainPage",
        component: MainPage
    },
    {
        path: "/register",
        name: "Register",
        component: RegisterPage
    },
    {
        path: "/login",
        name: "Login",
        component: LoginPage
    },
    {
        path: "/post",
        name: "Posts",
        component: PostPage
    }
];

const router = createRouter({
    history: createWebHashHistory(),
    routes
});

export default router;