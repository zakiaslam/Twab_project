function init(){
    try{
        const button=document.getElementById("profile");
        button.onclick = function(e) {

            onProfile(e);
            console.log("Submitted");
        };

    }catch (e){}
    try {
        const buttonQuery=document.getElementById("character_anime_works");
        buttonQuery.onclick=character_anime_works;
    }catch (e){}

}
function sendAxiosQuery(url, data) {
    axios.post(url , data)

        .then (function (dataR) {
            document.getElementById('results').innerHTML= "The result is:<pre> "+JSON.stringify(dataR.data, null, 2)+"</pre>";
            // document.getElementById('resultsDiv').style.display='block';
            // document.getElementById('xForm').style.display='none';
        })
        .catch( function (response) {
            alert (JSON.stringify(response));
        })
}
function onProfile(event){
    event.preventDefault();
    sendAxiosQuery( '/profile',null);
}
function onSubmitQuery(event){
    onSubmitAux(event, '/query')
}
function character_anime_works(event){
    event.preventDefault();
    window.location.href = '/character_anime_works';
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



