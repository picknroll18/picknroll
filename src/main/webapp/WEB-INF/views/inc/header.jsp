<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
/*--reset---------------------------------------------- */
body {
	margin: 0px;
}

h1 { 
	margin: 0px;
	padding : 0px; 
}

ul {
	padding: 0px;
	margin: 0px;
}

li {
	list-style-type: none;
}

a {
	text-decoration: none;
	color: black;
	padding: 0px;
	margin: 0px;
}
/*--custom style----------------------------------------*/
.hidden {
	display: none;
}

/*--component style-------------------------------------*/

.button{
	width: 24px;
	height: 24px;
	overflow: hidden; 
	text-indent: -999px;  
	border: 0px;
	padding: 0px;
	cursor: pointer;
}

	.notification-button { 
		background: url("/resources/images/notification.png") no-repeat;
		background-size: cover;
	}  
	
	.hamburger-button {
		background: url("/resources/images/icon-set.png") no-repeat 0px 0px;
	}
	
.photo{
	width : 150px;
	height : 150px;
	border : 1px solid #a9a9a9;
	border-radius: 75px; 
}
 
.photo-sm{

}
  
/*--header------------------------------------------------- */
#header {
	width: 100%;    
	height: 45px; 
	position: relative;
	line-height: 45px;  
}    
  
	#header > h1{   
	    display: flex;
	    justify-content: center;
	    align-items: center; 
	   	line-height: 45px; 
	}

	#header:after {
		display: block;
		position: fixed;
		background : #000000;
		top: 0px;   
		left: 0px;
		width: 100%; 
		height: 0%; /*장막을 위로 올린다.*/ 
		content: "";
		opacity: 0; 
		transition : 500ms opacity ease;
	}
	
	
#menu-button{ 
	height : 100%;  
	position: absolute;   
	top:0px; 
	left:0px;
	padding-left: 10px; 
}

#header-buttons{
	height : 100%;  
	position: absolute;    
	top:0px; 
	right:0px;
	padding-right: 10px; 
}

	#header #login-info {
		/*가상클래쓰를 쓰기 위해 header에 클래스를 둔다. 형제로 가즈아*/
		position: fixed;
		top: 0px;
		left: -80%;
		width: 80%;
		height: 100%; 
		background: #ffffff;
		z-index: 10;
		display: block;
		transition : 500ms left ease;
	}

	#header.menu-show #login-info {
		left: 0%;
	}
	
	#header.menu-show:after {
		opacity: 0.7;  
		height: 100%;
	}
	  
	 
	#teacher-menu li{
		margin-left: auto;    
		margin-right : auto; 
		width: 100px;
		text-align: center;
	}
	
/*----notification-container--------------------*/
	#header #notification-container{ 
		position: relative;
		display: none;
	}

	#header #notification-container .notification-info{
		position: absolute;   
		border : 1px solid #a9a9a9;
		background: white;  
		width : 30%;     
		top : 0px;
		right : 10px;
		z-index: 10;
	}
	      
	#header #notification-container .notification-arrow{
		position: absolute;     
		border-top: 0px solid transparent;
		border-right: 10px solid transparent;
		border-bottom: 10px solid #a9a9a9;   
		border-left: 10px solid transparent;
		top : -10px;     
		right : 13px;
		z-index: 10;    
	}
	
 	#header.notification-show #notification-container {
		display: block;
	}  
	 
	#header.notification-show:after {
		opacity: 0.7;   
		height: 100%; 
	}

	 
@media all and (min-width:700px){}
</style>
<header id="header"> 
	<h1>  
		<a href="/index">
			<picture>
				 <!-- 최소 700이상이면 바뀐다. -->
			 	 <!-- <source media="(min-width: 700px)" srcset="/resources/images/okinawa.jpg"> -->
				 <img src="/resources/images/logo.png">   
			</picture>
		</a>   
	</h1>     
	<section id="menu-button">  
		<h1 class="hidden">메뉴 버튼</h1> 
		<input class="button hamburger-button" type="button" value="메뉴보기">
	</section>
	
	<section id="header-buttons">  
		<h1 class="hidden">헤더 버튼</h1> 
		<input class="button notification-button" type="button" value="메뉴보기">
	</section>
	
	<aside id="notification-container"> 
		<h1 class="hidden">알림창</h1>     
		<section class="notification-arrow">
		</section>  
		<section class="notification-info">
			<ul>
				<li>나는 알람입니다. 잘부탁드립니다.</li>
			</ul>
		</section>
	</aside>
	
	<!-- aside로 묶는다. -->
	<aside id="login-info">
		<h1 class="hidden">로그인 정보</h1>
		<section class="profile">
			<h1 class="hidden">프로필</h1>
			<div>
				<div class="photo" style="background: url('/resources/images/okinawa.jpg') no-repeat center; background-size: cover; "></div>
				<div class="uid"><span>newlec</span></div>
				<c:if test="${empty pageContext.request.userPrincipal }">
					<div class="auth-status"><a href="">로그인</a></div>
				</c:if> 
				<c:if test="${not empty pageContext.request.userPrincipal }">
					<div class="auth-status"><a href="">로그아웃</a></div>
				</c:if>
				 
				<div class="notice"><span>강사공지 : </span><a href="#">3</a></div>
			</div>
		</section>
		<section id="teacher-menu">
			<h1 class="hidden">강사메뉴</h1>
			<ul>
				<li><a href="">문제관리</a></li>
				<li><a href="">시험관리</a></li>
				<li><a href="">일정관리</a></li>
				<li><a href="">수업관리</a></li>
			</ul>
		</section>
	</aside>
	
</header>
<script>
window.addEventListener("load", function(){
    var header = document.querySelector("#header");
    var menuButton = document.querySelector("#menu-button");
    var headerButtons = document.querySelector("#header-buttons");
    var notificationContainer = document.querySelector("#notification-container");
    var notificationButton = headerButtons.querySelector(".notification-button");
    
    header.onclick = function(e){
        var el = e.target; 
        if(el.nodeName =="HEADER"){
            header.classList.remove("menu-show");
        	header.classList.remove("notification-show");
        }
        else   
            return;  
    };   
      
    notificationButton.onclick = function(e){ 
    	header.classList.add("notification-show");  
        e.stopPropagation();    
    }
    
    menuButton.onclick = function(e){
        header.classList.add("menu-show"); 
        e.stopPropagation();
    };
    
});
</script>