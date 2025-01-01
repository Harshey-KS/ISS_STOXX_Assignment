// Function to validate the form fields
function validateForm() {
    let valid = true;

    // Get form values
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    // Clear previous errors
    document.getElementById("nameError").textContent = '';
    document.getElementById("emailError").textContent = '';
    document.getElementById("passwordError").textContent = '';

    // Name validation
    if (name.trim() === '') {
        document.getElementById("nameError").textContent = "Name is required.";
        valid = false;
    }

    // Email validation
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        document.getElementById("emailError").textContent = "Please enter a valid email.";
        valid = false;
    }

    // Password validation
    if (password.length < 6) {
        document.getElementById("passwordError").textContent = "Password must be at least 6 characters long.";
        valid = false;
    }

    // Return false to prevent form submission if validation fails
    return valid;
}
