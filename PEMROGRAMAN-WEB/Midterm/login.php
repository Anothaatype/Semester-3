<?php
session_start();

// Dummy username and password for the example (replace with a database check in real projects)
$correct_username = "admin";
$correct_password = "Adm12";

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $username = $_POST['username'];
    $password = $_POST['password'];

    // It use for checking the username and password also create an alert if the password or username is wrong
    // Validate credentials
    if ($username === $correct_username && $password === $correct_password) {
        // Set session variable
        $_SESSION['username'] = $username;
        // Redirect to Home Page
        header("Location: homePage.php");
        exit();
    } else {
        // Redirect back to login page with an error message
        echo "<script>alert('Invalid username or password');</script>";
        header("Refresh:0; url=loginPage.html");
        exit();
    }
} else {
    // If the request is not POST, redirect to the login page
    header("Location: loginPage.html");
    exit();
}
?>
