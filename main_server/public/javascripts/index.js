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
    try {
        const personbtn = document.getElementById("person");
        personbtn.onclick = person;
    } catch (e) {
    }
    try {
        const Animebtn = document.getElementById("Anime");
        Animebtn.onclick = Anime;
    } catch (e) {
    }
    try {
        const Profilebtn = document.getElementById("Profile");
        Profilebtn.onclick = Profile;
    } catch (e) {
    }

    // document.getElementById('results').style.display='none';
    // document.getElementById('xForm').style.display='block';


//
//
function character(event){
    event.preventDefault();

    window.location.href = '/characters';
}
    function person(event){
        event.preventDefault();

        window.location.href = '/person';
    }
    function Anime(event){
        event.preventDefault();

        window.location.href = '/Anime';
    }
    function Profile(event){
        event.preventDefault();

        window.location.href = '/users/profile';
    }

}

