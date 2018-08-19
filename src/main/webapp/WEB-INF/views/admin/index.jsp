<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width">
<title>PicknRoll 관리자</title>
<style>
body, h1, ul{
	margin: 0px;
	padding: 0px;
}

a{
	text-decoration: none;
}

li{
	list-style-type: none;
}

body{
	background : #2f4050;
}

.hide{ 
	display: none;
}

#wrapper{
	display: flex;
}
 
#nav{
	background : #2f4050;
	color: white;
	font-weight:bold;
	width: 300px;
}

#side-menu{
	box-sizing: border-box;
}

	#side-menu ul{
    	color: #676a6c;
	}
	
	#side-menu ul > li{
	}
	
	#side-menu .profile{
		background: #293848;
		padding-left :22px;
		padding-top : 22px;
		height : 150px;
	}
	
	#side-menu .profile div{
		background : white;
   		width: 100px; height: 100px;
   	 	object-fit: cover;
    	border-radius: 50%;
	}
	
	#side-menu .profile h1{
		color: white;
		font-size: 13px;
		margin-top: 5px;
	}
	
	
	#side-menu > ul > li > a{
		font-size: 13px;
		display: block;
		color: #a7b1c2;
    	font-weight: 600;
    	padding: 14px 20px 14px 25px;
	}
	
	#side-menu > ul > li > a:hover{
		background: #293848;
	}

#main{
	background: #f3f3f4;
	flex-grow: 1;
	height: 100vh;
	box-sizing: border-box;
	padding: 20px;	 
}
	
</style> 
</head>
<body>
	<div id="wrapper">
		<nav id="nav">
			<h1 class="hide">내비게이션</h1>
			<section id="side-menu">  
				<h1 class="hide">관리목록</h1>
				<ul>
					<li class="profile">
						<div></div>
						<h1>관리자 | flwj@naver.com</h1>
					</li>
					<li><a href="#">회원관리</a></li>
					<li><a href="#">서비스관리</a></li>
					<li><a href="#">앞으로 추가</a></li>
				</ul>
			</section>
		</nav>
		<main id="main">
			<header id="header">
				<h1>관리자 메인</h1>
				<hr />
			</header>
			<section> 
				<p>안녕하세요 관리자님 <br />오늘은 어떤 볼일을?</p>
			</section>
		</main>
	</div> 
</body>
</html>