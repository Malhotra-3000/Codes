// Assuming you have a canvas set up and context (ctx) defined

// Set the background image
let backgroundImage = new Image();
backgroundImage.src = 'path/to/your/background.jpg'; // Update this path to your background image

backgroundImage.onload = function() {
    ctx.drawImage(backgroundImage, 0, 0, canvas.width, canvas.height);
    // Call function to draw snake and food after background loads
    drawSnake();
    drawFood();
};

// Food properties
let food = {
    x: Math.floor(Math.random() * canvas.width / 10) * 10,
    y: Math.floor(Math.random() * canvas.height / 10) * 10,
    size: 10,
    color: 'red' // Make sure the food color contrasts with the background
};

// Function to draw the food
function drawFood() {
    ctx.fillStyle = food.color;
    ctx.fillRect(food.x, food.y, food.size, food.size);
}

// Function to draw the snake (example)
function drawSnake() {
    // your snake drawing logic
}

// Ensure that the background is drawn first, then the snake, then the food
function gameLoop() {
    ctx.clearRect(0, 0, canvas.width, canvas.height); // Clear the canvas
    ctx.drawImage(backgroundImage, 0, 0, canvas.width, canvas.height); // Draw background
    drawSnake(); // Draw the snake
    drawFood();  // Draw the food on top
    // Other game logic...
}

// Run the game loop
setInterval(gameLoop, 100);
