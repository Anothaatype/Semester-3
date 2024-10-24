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

        // Validate password
        let password = $("#password").val();
        if (password === "") {
            $("#passwordError").text("Must be filled").show();
            isValid = false;
        } else if (password.length > 6) {
            $("#passwordError").text("Password is more than 6 characters").show();
            isValid = false;
        } else if (!(password.match(/[A-Z]/) && password.match(/[a-z]/))) {
            $("#passwordError").text("Password must be uppercase and lowercase.").show();
            isValid = false;
        } else {
            $("#passwordError").hide();
        }

        if (isValid) {
            this.submit(); // Submit if validation passes
        }
    });
});
