
var getWeather = function () {
    var weather = document.getElementById("weather");
    var req = new XMLHttpRequest();
    req.open('GET', 'http://localhost:8080/weather', false);
    req.send(null);
    if(req.status == 200) {
        weather.innerHTML = req.responseText;

        console.log(req.responseText);
    }
};

$(function(){
    switch (document.location.pathname) {
        case '/mainNews' :
            goToLink("mainNews");
            break;
        case '/archive' :
            goToLink("archive");
            break;
        case '/login' :
            goToLink("login");
            break;
        case '/logout' :
            goToLink("logout");
            break;
        case '/enroll' :
            goToLink("enroll");
            break;
        default:
            goToLink("mainNews");
            break;
    }

    function goToLink(link) {
        $.get("/serv/" + link, function(responseText){
            document.getElementById("wrapper").innerHTML = responseText;
        });
        event.preventDefault();
    }

    $(document).on("click", ".menu_link", function (event) {

        history.replaceState(null, '', '/' + event.target.textContent);
        $.get("/serv/" + $(this).attr('href') , function(data){
            document.getElementById("wrapper").innerHTML = data;
        });
        event.preventDefault();
    });

    $(document).on("click", "#users_list", function(){
        $.get("/serv/" + $(this).attr('href') , function(data){
            document.getElementById("wrapper").innerHTML = data;
        });
        event.preventDefault();
    });

    $(document).on("click", "#logout_btn", function (event) {
        $.get("/serv/" + $(this).attr('href') , function(data){
            document.getElementById("wrapper").innerHTML = data;
        });
        event.preventDefault();
    });

    $(document).on("click", "#toenroll", function(){
        $.get("/serv/" + $(this).attr('href') , function(data){
            document.getElementById("wrapper").innerHTML = data;
        });
        event.preventDefault();
    });

    $(document).on("click", "button#login-button", function (event) {
        var formData = {
            'username': $('input[name=username]').val(),
            'password': $('input[name=password]').val()
        };

        $.post("/serv/login", formData, function(data) {
            document.getElementById("page-content").innerHTML = data;
        });
        event.preventDefault();
    });

    $(document).on("click", "#submit_enroll", function (event) {
        var formData = {
            'username': $('input[name=username]').val(),
            'age': $('input[name=age]').val(),
            'email': $('input[name=email]').val(),
            'pwd': $('input[name=pwd]').val()
        };

        $.post("/serv/enroll", formData, function(data) {
            document.getElementById("wrapper").innerHTML = data;
        });
        event.preventDefault();
    });

    $(document).on("click", "#login_btn", function (event) {
        var formData = {
            'login': $('input[name=login]').val(),
            'password': $('input[name=password]').val()
        };

        $.post("/serv/login", formData, function(data) {
            document.getElementById("wrapper").innerHTML = data;
        });
        event.preventDefault();
    });

    $(document).on("click", "#logout_btn", function(){
        $.get("/serv/" + $(this).attr('href') , function(data){
            document.getElementById("wrapper").innerHTML = data;
        });
        event.preventDefault();
    });
});