<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Laundry XYZ - Home</title>
        <link rel="stylesheet" href="styles.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    </head>
    <body>
    
    <!-- Link Header --> 
    <?php
    include 'header.php';
    ?>

    <!--Satu Container -->
    <div class="container">
        <!-- Custom Banner Slider -->
        <div class="banner-slider">
            <div class="slides">
                <div class="slide active">
                    <img src="img/img1.jpg" alt="Banner Image 1" class="banner-img">
                </div>
                <div class="slide">
                    <img src="img/img2.jpg" alt="Banner Image 2" class="banner-img">
                </div>
                <div class="slide">
                    <img src="img/img3.jpg" alt="Banner Image 3" class="banner-img">
                </div>
            </div>
            <div class="controls">
                <span class="prev">❮</span>
                <span class="next">❯</span>
            </div>
            <div class="dots">
                <span class="dot active" data-slide="0"></span>
                <span class="dot" data-slide="1"></span>
                <span class="dot" data-slide="2"></span>
            </div>
        </div>
        
        <!-- Company Profile Section -->
        <div class="company-profile">
            <h2>Company Profile</h2>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
            </p>
        </div>
    </div>

    <!-- Link Footer --> 
    <?php
    include 'footer.php';
    ?>

    <!-- jQuery Slider Script -->
        <script>
            $(document).ready(function () {
                let currentIndex = 0;
                const slides = $('.slide');
                const dots = $('.dot');
                
                function showSlide(index) {
                    // Hide all slides
                    slides.removeClass('active');
                    dots.removeClass('active');
                    
                // Show the selected slide
                slides.eq(index).addClass('active');
                dots.eq(index).addClass('active');
            }

            function nextSlide() {
                currentIndex = (currentIndex + 1) % slides.length;
                showSlide(currentIndex);
            }

            function prevSlide() {
                currentIndex = (currentIndex - 1 + slides.length) % slides.length;
                showSlide(currentIndex);
            }

            $('.next').click(nextSlide);
            $('.prev').click(prevSlide);

            dots.click(function () {
                const index = $(this).data('slide');
                currentIndex = index;
                showSlide(index);
            });

            // Auto slide every 3 seconds
            setInterval(nextSlide, 3000);
        });
    </script>

</body>
</html>
