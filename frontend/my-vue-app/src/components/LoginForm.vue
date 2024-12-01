<template>
  <div class="login-form">
    <form @submit.prevent="login">
      <div class="container">
        <input v-model="username" class="input" placeholder="Username" />
        <input v-model="password" class="input" type="password" placeholder="Password" />
        <button type="submit" class="submit">Login</button>
      </div>
    </form>
  </div>
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
  width: 100%;
  align-items: center;
  margin-top: 16px;
}
.container {
  display: flex;
  flex-direction: column;
  width: 100%;
}

.input{
  margin-bottom: 16px;
  border: slategrey solid 1px;
  border-radius: 4px;
  padding: 0 16px;
  height: 48px;
}


.submit {
  height: 48px;
  width: 300px;
  color: white;
  background-color: black;
  border-radius: 8px;
}

</style>
