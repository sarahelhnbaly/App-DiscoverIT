<template>
  <form @submit.prevent="register">
    <input v-model="username" placeholder="Username" required />
    <input v-model="email" placeholder="Email" required type="email" />
    <input v-model="password" placeholder="Password" required type="password" />
    <button type="submit">Register</button>
  </form>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      username: '',
      email: '',
      password: ''
    };
  },
  methods: {
    async register() {
      try {
        const response = await axios.post('http://localhost:8080/api/users', {
          username: this.username,
          email: this.email,
          password: this.password
        });
        console.log(response.data);
        alert(`Welcome ${response.data.username}`); // Successful registration message
      } catch (error) {
        alert('Registration failed: Unable to register user');
      }
    }
  }
};
</script>

<style scoped>
/* Add your styles here if needed */
form {
  max-width: 300px;
  margin: auto;
}
input {
  display: block;
  margin-bottom: 10px;
  width: 100%;
}
button {
  width: 100%;
}
</style>
