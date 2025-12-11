function init(){
    console.log("Initializing...");
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
// function onSubmitAux(event, url){
//     // The .serializeArray() method creates a JavaScript array of objects
//     // https://api.jquery.com/serializearray/
//     const formArray= $("form").serializeArray();
//     console.log("formArray", formArray);
//     const data={};
//     for (let index in formArray){
//         data[formArray[index].name]= formArray[index].value;
//     }
//     // const data = JSON.stringify($(this).serializeArray());
//     sendAxiosQuery(url, data);
//     // prevent the form from reloading the page (normal behaviour for forms)
//     event.preventDefault()
// }