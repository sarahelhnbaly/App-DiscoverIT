<template>
  <form @submit.prevent="login">
    <div class="login-form">
      <input v-model="username" placeholder="Username" />
      <input v-model="password" type="password" placeholder="Password" />
      <button type="submit">Login</button>
    </div>
  </form>
</template>

<script>
import axios from 'axios';
export default {
  data() {
    return {
      username: 'Sarah',
      password: 'Elhanbaly'
    };
  },
  methods: {
    async login() {
      try {
        const response = await axios.post('http://localhost:8080/api/users/login', {
          username: this.username,
          password: this.password
        });
        alert(response.data);
      } catch (error) {
        alert('Login failed');
      }
    }
  }
};
</script>

<style scoped>
.login-form {
  display: flex;
  flex-direction: column;
}
</style>
