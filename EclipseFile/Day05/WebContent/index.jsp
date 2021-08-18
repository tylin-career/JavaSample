<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script type="text/javascript">
        var request = new XMLHttpRequest();
        function searchFunction(){
            request.open("POST","./uss?userName="+encodeURIComponent(document.getElementById("userName")), true);
            request.onreadystatechange = searchProcess;
            request.send(nill);
        }

        function searchProcess(){
            var table = document.getElementById("ajaxTable");
            table.innerHTML="";
            if(request.readyState == 4 && request.status == 200){
                var object = eval('(' + request.responseText + ')');
                var result = object.result;
                for(var i=0;i<result.length;i++){
                    var row = table.insertRow(0);
                    for(var j=0;j<result[i].length;j++){
                        var cell = row.insertCell(j);
                        cell.innerHTML = result[i][j].value;
                    }
                }

            }
        }
		
		
	</script>
</head>
<body>
	<!-- 選單 -->
	<div class="container">

		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="#">Home <span
							class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Disabled</a>
					</li>
				</ul>
				<form  action="uss"  method="post" class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Search" aria-label="Search" name="username" id="userName" onkeyup="searchFunction()">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="searchFunction()">Search</button>
				</form>
			</div>
		</nav>
	<!-- 廣告輪播 -->
		<div id="carouselExampleControls" class="carousel slide"
			data-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="https://png.pngtree.com/thumb_back/fw800/back_our/20190617/ourmid/pngtree-taobao-yellow-geometric-poster-background-image_127501.jpg"
						class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="https://png.pngtree.com/thumb_back/fw800/back_our/20190617/ourmid/pngtree-celebration-masquerade-banner-poster-image_128203.jpg"
						class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="https://img.lovepik.com//back_pic/05/81/88/645c3d3ad0972fd.jpg_wh860.jpg"
						class="d-block w-100" alt="...">
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleControls"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleControls"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>

		<!-- table -->
		<br>

		<table class="table" style="text-align: center; border: 1px solid #dddddd" >
			<thead>
				<tr>
					<th style="background-color: #fafafa">姓名</th>
					<th style="background-color: #fafafa">年紀</th>
					<th style="background-color: #fafafa">性別</th>
					<th style="background-color: #fafafa">郵件</th>
				</tr>
			</thead>
			<tbody id="ajaxTable">
				<tr>
					<td>Tom</td>
					<td>32</td>
					<td>公</td>
					<td>tom@gmail.com</td>
				</tr>
			</tbody>
		</table>
		
		
		
	</div>




	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>