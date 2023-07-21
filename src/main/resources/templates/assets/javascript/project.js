// modal for new proj
var modal_proj = document.getElementById("modalProj");
function openModalProj() {
  modal_proj.style.display = "flex";
}

function closeModalProj() {
modal_proj.style.display = "none";
}

var closeBtn = document.getElementsByClassName("close")[0];

closeBtn.onclick = function() {
  closeModalProj();
};

//call api
//get all:
// // Function to make the API call and display the result
// async function fetchDataFromAPI() {
//   const apiUrl = 'http://localhost:8000/api/project'; // Replace this with the actual API endpoint URL
//
//   try {
//       const response = await fetch(apiUrl);
//       if (!response.ok) {
//           throw new Error('Network response was not ok.');
//       }
//       const data = await response.json();
//       displayData(data);
//   } catch (error) {
//       console.error('Error fetching data:', error.message);
//       displayData({ error: 'Failed to fetch data from the API.' });
//   }
// }

// // Function to display the API response on the web page
// function displayData(data) {
//   const resultElement = document.getElementById('result');
//   resultElement.innerHTML = JSON.stringify(data, null, 2);
// }
//
// // Add a click event listener to the button
// const getDataButton = document.getElementById('getDataButton');
// getDataButton.addEventListener('click', fetchDataFromAPI);
