var ajaxRequest;

function initializeAjax(){
    ajaxRequest = new XMLHttpRequest();
}

function validateZipCodeAndIfCorrectThenPrintLocality(){
    initializeAjax();
    ajaxRequest.onreadystatechange = processRequest();
    if(!target) target = document.getElementById("zipCodeField");
    var url = "getLocality?zipCode=" + escape(target.value);
    ajaxRequest.open("GET", url, true);
    ajaxRequest.send(null);
    document.getElementById("localityResult").innerHTML = ajaxRequest.responseText;
}

function processRequest() {
    if(req.readyState == 4 && req.status == 200)
        document.getElementById("serverConnectionStatus").innerHTML = "Server OK";
}