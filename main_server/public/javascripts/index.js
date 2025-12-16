function init(){
    try{
        const characterNicknames=document.getElementById("character_nicknames");
        characterNicknames.onclick =character_nicknames;


    }catch (e){}
    try {
        const buttonQuery=document.getElementById("character_anime_works");
        buttonQuery.onclick=character_anime_works;
    }catch (e){}

}



function character_anime_works(event){
    event.preventDefault();
    window.location.href = '/all';
}

// Wait until the DOM is loaded
document.addEventListener("DOMContentLoaded", () => {
    const searchbtn = document.getElementById("submitbtn");
    if (searchbtn) {
        searchbtn.onclick = searchbtnfun;
    }
    function searchbtnfun(event) {
        try {
            event.preventDefault();
            const query = document.getElementById("searchInput").value;
            window.location.href = `/character_anime_works?search=${encodeURIComponent(query)}`;
        } catch (e) {
            console.log(e);
        }
    }
});
function character_nicknames(event){
    event.preventDefault();
    console.log("character_nicknames");
    window.location.href = '/character_nicknames';
}
document.addEventListener("DOMContentLoaded", () => {
    const searchNickname = document.getElementById("submitbtn");
    if (searchNickname) {
        searchNickname.onclick = Nickname;
    }
    function Nickname(event) {
        try {
            event.preventDefault();
            const query = document.getElementById("searchInput").value;
            window.location.href = `/character_nicknames?search=${encodeURIComponent(query)}`;
        } catch (e) {
            console.log(e);
        }
    }
});


