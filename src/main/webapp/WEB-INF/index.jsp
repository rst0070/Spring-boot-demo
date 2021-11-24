<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/static/style.css"/>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
</head>
<body>
    <h1>hello</h1>
    <div class="container" id="postDiv">
        <h2>POST request</h2>
        <label for="name">student name</label>
        <input type="text" name="name" placeholder="name"/><br/>
        <label for="email">email address</label>
        <input type="text" name="email"/><br/>
        <label for="dob">date of birth</label>
        <input type="date" name="dob"/><br/>
        <button onClick="POSTAction()">save new student</button>
    </div>
    <div class="container" id="getDiv">
        <h2>GET request</h2>
        <button onClick="GETAction()">get students information</button>
        <div id="GETResult"></div>
    </div>
    <div class="container" id="putDiv">
        <h2>PUT request</h2>
    </div>
    <div class="container" id="delteDiv">
        <h2>DELETE request</h2>
        <input type="text" placeholder="email of student to delete"/>
        <button>delete</button>
    </div>

    <script>

        function POSTAction(){
            let stdata = {
                student : {
                    name : $('#postDiv input[name=name]').val(),
                    email : $('#postDiv input[name=email]').val(),
                    dob : $('#postDiv input[name=dob]').val()
                }
            }
            $.ajax({
                url: "/student",
                method:"POST",
                contentType:"application/json",
                data: JSON.stringify(stdata),
                success: (data) => {
                  console.log(data);
                } 
            })
        }

        function GETAction(){
            $.ajax({
                url: "/student",
                method:"GET",
                success: (data) => {
                  $('#GETResult').text(JSON.stringify(data));
                } 
            })
        }


    </script>
</body>
</html>
