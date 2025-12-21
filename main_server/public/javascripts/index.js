function init() {
    try {

        const characterbtn = document.getElementById("character");
        characterbtn.onclick = character;


    } catch (e) {
    }
    try {
        const FindById = document.getElementById("nameClick");
        FindById.onclick = FindnameById;
    } catch (e) {
    }
    // document.getElementById('results').style.display='none';
    // document.getElementById('xForm').style.display='block';

//
//
function character(event){
    event.preventDefault();

    window.location.href = '/all';
}
    function FindnameById(event){
        event.preventDefault();

       console.log("Findname");
    }
//
// // Wait until the DOM is loaded
// document.addEventListener("DOMContentLoaded", () => {
//     const searchbtn = document.getElementById("submitbtn");
//     if (searchbtn) {
//         searchbtn.onclick = searchbtnfun;
//     }
//     function searchbtnfun(event) {
//         try {
//             event.preventDefault();
//             const query = document.getElementById("searchInput").value;
//             window.location.href = `/character_anime_works?search=${encodeURIComponent(query)}`;
//         } catch (e) {
//             console.log(e);
//         }
//     }
// });
// function character_nicknames(event){
//     event.preventDefault();
//     console.log("character_nicknames");
//     window.location.href = '/character_nicknames';
// }
// document.addEventListener("DOMContentLoaded", () => {
//     const searchNickname = document.getElementById("submitbtn");
//     if (searchNickname) {
//         searchNickname.onclick = Nickname;
//     }
//     function Nickname(event) {
//         try {
//             event.preventDefault();
//             const query = document.getElementById("searchInput").value;
//             window.location.href = `/character_nicknames?search=${encodeURIComponent(query)}`;
//         } catch (e) {
//             console.log(e);
//         }
//     }
// });
}

