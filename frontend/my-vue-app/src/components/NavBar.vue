<script setup lang="ts">

</script>

<template>
<nav class="nav-bar">
  <ul class="nav-links">
    <li>
      <RouterLink to="/login">
        Login
      </RouterLink>
    </li>
    <li>
      <RouterLink to="/register">
        Register
      </RouterLink>
    </li>
    <li>
      <RouterLink to="/post">
        Create Post
      </RouterLink>
    </li>
  </ul>
</nav>
</template>

<style scoped>


.nav-links {
  display: flex;
  flex-direction: row;
  align-items: center;
  gap: 16px;
}

.nav-links > li {
  text-decoration: none;
  font-size: 16px;
  color: #2c3e50;
  margin: 16px;
  list-style: none;
}

</style>