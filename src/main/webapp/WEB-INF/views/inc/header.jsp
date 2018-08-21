<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
/*--reset---------------------------------------------- */
body {
	margin: 0px;
}

h1 {
	margin: 0px;
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
}

	.find-button {
		background: url("/picknroll/resources/images/icon-set.png") no-repeat -24px 0px;
	}  
	
	.hamburger-button {
		background: url("/picknroll/resources/images/icon-set.png") no-repeat 0px 0px;
	} 
  
/*--header---------------------------------------------- */
#header {
	width: 100%;
	height: 45px; 
}
  
	#header:after {
		display: block;
		position: fixed;
		background : #000000;
		top: 45px;   
		left: 0px;
		width: 100%; 
		height: 0%; /*장막을 위로 올린다.*/ 
		content: "";
		opacity: 0; 
		transition : 500ms opacity ease;
	}
	
	
#header-buttons{
 
}  


	#header #notification-menu {
		/*가상클래쓰를 쓰기 위해 header에 클래스를 둔다. 형제로 가즈아*/
		position: fixed;
		top: 45px; 
		right: -50%;
		width: 50%;
		height: 100%; 
		background: #ffffff;
		z-index: 10;
		display: block; 
		transition : 500ms right ease;
	}

	#header.right-menu-show #notification-menu {
		right: 0%;
	}
	
	#header.right-menu-show:after {
		opacity: 0.5; 
		height: 100%;
	}
	
/*-----------------------------------------------*/	
	
	#header #main-menu {
		/*가상클래쓰를 쓰기 위해 header에 클래스를 둔다. 형제로 가즈아*/
		position: fixed;
		top: 45px; 
		left: -50%;
		width: 50%;
		height: 100%; 
		background: #ffffff;
		z-index: 10;
		display: block;
		transition : 500ms left ease;
	}
	
	#header.left-menu-show #main-menu {
		left: 0%;
	}
	
	#header.left-menu-show:after {
		opacity: 0.5; 
		height: 100%;
	}
	
</style>
<header id="header" class="right-menu-show">
	<h1>PicknRoll</h1>  
	<section id="header-buttons">
		<h1 class="hidden">헤더 버튼</h1>
		<input class="button find-button" type="button" value="검색">
		<input class="button hamburger-button" type="button" value="메뉴보기">
	</section>
	<section id="main-menu">
		<h1 class="hidden">메뉴</h1>
		<ul>
			<li><a href="">어쩌구 메뉴</a></li>
			<li><a href="">어쩌구 메뉴</a></li>
			<li><a href="">어쩌구 메뉴</a></li>
			<li><a href="">어쩌구 메뉴</a></li>
		</ul>
	</section>
	<section id="notification-menu">
		<h1 class="hidden">알림</h1>
		<ul>
			<li><a href="">어쩌구 알림</a></li>
			<li><a href="">어쩌구 알림</a></li>
			<li><a href="">어쩌구 알림</a></li>
			<li><a href="">어쩌구 알림</a></li>
		</ul>
	</section>
</header>
<script>
</script>