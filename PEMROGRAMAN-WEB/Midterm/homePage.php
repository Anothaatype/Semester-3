<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"> <!-- Sets the character encoding to UTF-8 for better compatibility -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Makes the page responsive -->
    <title>Laundry XYZ - Home</title> <!-- Page title -->
    <link rel="stylesheet" href="styles.css"> <!-- Links to the external CSS file for styling -->
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script> <!-- Includes the jQuery library -->
</head>
<body>

<!-- Include the header section -->
<?php
include 'header.php';
?>

<!-- Main container for the content -->
<div class="container">

    <!-- Banner slider for rotating images -->
    <div class="banner-slider">
        <div class="slides">
            <!-- Individual slides -->
            <div class="slide active">
                <img src="img/img1.jpg" alt="Banner Image 1" class="banner-img"> <!-- First image -->
            </div>
            <div class="slide">
                <img src="img/img2.jpg" alt="Banner Image 2" class="banner-img"> <!-- Second image -->
            </div>
            <div class="slide">
                <img src="img/img3.jpg" alt="Banner Image 3" class="banner-img"> <!-- Third image -->
            </div>
        </div>
        
        <!-- Controls for navigating between slides -->
        <div class="controls">
            <span class="prev">❮</span> <!-- Previous slide button -->
            <span class="next">❯</span> <!-- Next slide button -->
        </div>

        <!-- Dots for slide navigation -->
        <div class="dots">
            <span class="dot active" data-slide="0"></span> <!-- Dot for the first slide -->
            <span class="dot" data-slide="1"></span> <!-- Dot for the second slide -->
            <span class="dot" data-slide="2"></span> <!-- Dot for the third slide -->
        </div>
    </div>

    <!-- Company profile section -->
    <div class="company-profile">
        <h2>Company Profile</h2> <!-- Section heading -->
        <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 
            Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
            Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
        </p> <!-- Placeholder text about the company -->
    </div>
</div>

<!-- Include the footer section -->
<?php
include 'footer.php';
?>

<!-- jQuery script for the slider functionality -->
<script>
    $(document).ready(function () {
        let currentIndex = 0; // Tracks the current slide index
        const slides = $('.slide'); // Selects all slides
        const dots = $('.dot'); // Selects all dots

        // Function to show a specific slide
        function showSlide(index) {
            slides.removeClass('active'); // Hides all slides
            dots.removeClass('active'); // Deactivates all dots

            slides.eq(index).addClass('active'); // Activates the selected slide
            dots.eq(index).addClass('active'); // Activates the corresponding dot
        }

        // Function to show the next slide
        function nextSlide() {
            currentIndex = (currentIndex + 1) % slides.length; // Increment and loop to the first slide if at the end
            showSlide(currentIndex);
        }

        // Function to show the previous slide
        function prevSlide() {
            currentIndex = (currentIndex - 1 + slides.length) % slides.length; // Decrement and loop to the last slide if at the start
            showSlide(currentIndex);
        }

        // Attach event handlers to the next and previous buttons
        $('.next').click(nextSlide);
        $('.prev').click(prevSlide);

        // Allow dots to navigate to specific slides
        dots.click(function () {
            const index = $(this).data('slide'); // Get the slide index from the dot's data attribute
            currentIndex = index;
            showSlide(index);
        });

        // Automatically transition to the next slide every 3 seconds
        setInterval(nextSlide, 3000);
    });
</script>

</body>
</html>
