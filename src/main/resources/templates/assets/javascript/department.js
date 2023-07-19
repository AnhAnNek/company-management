// modal for delete employee
var modal_Delete = document.getElementById("modalDelete");
function openModalDelete() {
  modal_Delete.style.display = "flex";
}

function closeModalDelete() {
modal_Delete.style.display = "none";
}

var closeBtn = document.getElementsByClassName("close")[0];

closeBtn.onclick = function() {
  closeModalDelete();
};