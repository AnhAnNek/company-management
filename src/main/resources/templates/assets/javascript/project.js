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