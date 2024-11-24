$(document).ready(function () {
    $("#loginForm").on('submit', function (event) {
        event.preventDefault(); // Prevent form submission until validated
        let isValid = true;

        // Validate username
        if ($("#username").val() === "") {
            $("#usernameError").text("Must be filled").show();
            isValid = false;
        } else {
            $("#usernameError").hide();
        }

        // Validate the password field
        let password = $("#password").val(); // Get the value of the password field
        if (password === "") { // Check if the password field is empty
            $("#passwordError").text("Must be filled").show(); // Show error message
            isValid = false; // Mark the form as invalid
        } else if (password.length > 6) { // Check if the password is longer than 6 characters
            $("#passwordError").text("Password is more than 6 characters").show(); // Show error message
            isValid = false; // Mark the form as invalid
        } else if (!(password.match(/[A-Z]/) && password.match(/[a-z]/))) { // Check if the password contains both uppercase and lowercase letters
            $("#passwordError").text("Password must be uppercase and lowercase.").show(); // Show error message
            isValid = false; // Mark the form as invalid
        } else {
            $("#passwordError").hide(); // Hide the error message if the field is valid
        }

        // to sent the form if it is valid
        if (isValid) {
            this.submit(); // Submit if validation passes
        }
    });
});
