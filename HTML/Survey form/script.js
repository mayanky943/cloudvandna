function submitForm(event) {
  event.preventDefault();

  // Retrieve form values
  const firstName = document.getElementById("firstName").value;
  const lastName = document.getElementById("lastName").value;
  const dob = document.getElementById("dob").value;
  const country = document.getElementById("country").value;
  const gender = Array.from(document.querySelectorAll('input[name="gender"]:checked')).map(checkbox => checkbox.value).join(", ");
  const profession = document.getElementById("profession").value;
  const email = document.getElementById("email").value;
  const mobile = document.getElementById("mobile").value;

  // Display the values in the popup
  const popupList = document.getElementById("popupList");
  popupList.innerHTML = `
      <li><b>First Name:</b> ${firstName}</li>
      <li><b>Last Name:</b> ${lastName}</li>
      <li><b>Date of Birth:</b> ${dob}</li>
      <li><b>Country:</b> ${country}</li>
      <li><b>Gender:</b> ${gender}</li>
      <li><b>Profession:</b> ${profession}</li>
      <li><b>Email:</b> ${email}</li>
      <li><b>Mobile Number:</b> ${mobile}</li>
  `;

  // Show the popup
  document.getElementById("popup").style.display = "block";

  // Reset the form
  document.getElementById("surveyForm").reset();
}

function resetForm() {
  document.getElementById("surveyForm").reset();
}

function closePopup() {
  document.getElementById("popup").style.display = "none";
}
