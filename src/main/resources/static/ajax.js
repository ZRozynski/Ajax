$(document).ready(function () {
    var url = window.location;

    function RestGETLocality () {

        var ZipCodeData = {
            zipCode : $("#zipCodeField").value()
        }
        document.getElementById("serverConnectionStatus").innerHTML = ZipCodeData.zipCode;
        $.ajax({
            type:       'GET',
            url:        url + '/getLocality',
            datatype:   json,
            data:       JSON.stringify(ZipCodeData),
            async:      true,
            success:    function (result) {
                var locality= " ";
                $.forEach(result.data, function (i, locality) {
                    locality = locality.locality;
                    $("#localityResult").append(locality);
                })
            },
            error: function () {
                document.getElementById("localityResult").innerHTML = "błąd/ brak miejscowośći";
            }
        })
    }
})
