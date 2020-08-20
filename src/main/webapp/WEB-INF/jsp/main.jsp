<%--
  Created by IntelliJ IDEA.
  User: K550V
  Date: 2020/6/17
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>注册登录界面</title>
    <script src="https://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
    <style>
        * {
            margin:0;
            padding:0;
            box-sizing:border-box;
        }
        body {
            font-family:Arial,helvetica,sans-serif;
            background:#f6f5f7;
            display:flex;
            flex-direction:column;
            justify-content:center;
            align-items:center;
            height:100vh;
        }
        h1 {
            font-weight:bold;
            margin:0;
        }
        p {
            /*默认为16px*/
            font-size:14px;
            font-weight:100;
            line-height:20px;
            letter-spacing:0.5px;
            margin:20px 0 30px;
        }
        span {
            font-size:12px;
        }
        a {
            color:#333;
            font-size:18px;
            text-decoration:none;
            margin:30px 0px;
        }
        .fabfa-qq {
            background:url(../img/qq.png) no-repeat center;
            width:auto;
            height:auto;
            background-size:cover;
            display:inline-block;
        }
        /*container*/
        .container {
            background:#fff;
            border-radius:10px;
            /*      水平阴影   垂直阴影    模糊距离    阴影颜色*/
            box-shadow:0 14px 28px rgba(0,0,0,0.25),0 10px 10px rgba(0,0,0,0.22);
            position:relative;
            overflow:hidden;
            width:768px;
            max-width:100%;
            min-height:480px;
        }
        .form-container form {
            background-color:#fff;
            display:flex;
            flex-direction:column;
            padding:0 30px;
            height:100%;
            justify-content:center;
            align-items:center;
            text-align:center;
        }
        .social-container {
            margin:10px 0;
        }
        .social-container a {
            border:1px solid #ddd;
            border-radius:50%;
            display:inline-flex;
            justify-content:center;
            align-items:center;
            margin:0px 5px;
            height:40px;
            width:40px;
        }
        .form-container input {
            background:#eee;
            border:none;
            padding:12px 15px;
            margin:5px 0;
            width:100%;
        }
        button {
            border-radius:20px;
            border:1px solid #ff4b2b;
            background:#FF4B2B;
            color:#fff;
            font-size:12px;
            font-weight:bold;
            padding:12px 45px;
            letter-spacing:1px;
            transition:transform 80ms ease-in;
        }
        button:active {
            transform:scale(0.95);
        }
        button:focus {
            outline:none;
        }
        button.ghost {
            background:transparent;
            border-color:#fff;
        }
        .form-container {
            position:absolute;
            top:0;
            height:100%;
            transition:all 0.6s ease-out;
        }
        /*sign in*/
        .sign-in-container {
            left:0;
            width:50%;
            z-index:2;
        }
        /*sign up*/
        .sign-up-container {
            left:0;
            width:50%;
            opacity:0;
            z-index:1;
        }
        /*overlay-container*/
        .overlay-container {
            position:absolute;
            top:0;
            left:50%;
            width:50%;
            height:100%;
            overflow:hidden;
            transition:transform 0.6s ease-in-out;
            z-index:100;
        }
        .overlay {
            background:#ff416c;
            background:linear-gradient(to right,#ff4b2b,#ff416c) no-repeat 0 0/cover;
            color:#fff;
            height:100%;
            width:200%;
            position:relative;
            left:-100%;
            transform:translateX(0);
            transition:transform 0.6s ease-in-out;
        }
        .overlay-panel {
            position:absolute;
            top:0;
            display:flex;
            flex-direction:column;
            justify-content:center;
            align-items:center;
            height:100%;
            width:50%;
            padding:0 40px;
            text-align:center;
            transform:translateX(0);
            transition:transform 0.6s ease-in-out;
        }
        .overlay-right {
            right:0;
            transform:translateX(0);
        }
        .overlay-left {
            transform:translateX(-20%);
        }
        /*animation*/
        /*move signIn to right*/
        .container.right-panel-active .sign-in-container {
            transform:translateX(100%);
        }
        /*move overlay to left*/
        .container.right-panel-active .overlay-container {
            transform:translateX(-100%);
        }
        /*bring sign up over sign in*/
        .container.right-panel-active .sign-up-container {
            opacity:1;
            z-index:5;
            transform:translateX(100%);
        }
        /*move overlay back to right*/
        .container.right-panel-active .overlay {
            transform:translateX(50%);
        }
        .container.right-panel-active .overlay-left {
            transform:translateX(0);
        }
        .container.right-panel-active .overlay-right {
            transform:translateX(20%);
        }
    </style>
</head>
<body>
<link rel="stylesheet" href="https://www.jq22.com/jquery/font-awesome.4.7.0.css">
<div class="container" id="container">
    <div class="form-container sign-up-container">
        <form action="register">
            <h1>注 册</h1>
            <div class="social-container">
                <a href="###" class="social">
                    <i class="fa fa-wechat">
                    </i>
                </a>
                <a href="###" class="social">
                    <i class="fa fa-weibo"></i>
                </a>
                <a href="###" class="social">
                    <i class="fa fa-qq"></i>
                </a>
            </div>
            <span>选择以上方式登录或者使用您的账号</span>
            <input type="text" placeholder="姓名" name="name">
            <input type="email" placeholder="邮箱" name="email">
            <input type="password" placeholder="密码" name="password">
            <button type="submit">注册</button>

        </form></div>
    <div class="form-container sign-in-container">
        <form action="login">
            <h1>登 录</h1>
            <div class="social-container">
                <a href="###" class="social">
                    <i class="fa fa-wechat">
                    </i>
                </a>
                <a href="###" class="social">
                    <i class="fa fa-weibo"></i>
                </a>
                <a href="###" class="social">
                    <i class="fa fa-qq"></i>
                </a>
            </div>
            <span>选择以上方式登录或者使用您的账号</span>
            <input type="text" placeholder="账号" name="name">
            <input type="password" placeholder="密码" name="password">
            <a href="###">忘记密码？</a>
            <button type="submit">登录</button>
        </form>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>已有账号？</h1>
                <p>请使用您的账号进行登录</p>
                <button class="ghost" id="signIn" type="button">登录</button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>没有账号？</h1>
                <p>立即注册加入我们，和我们一起开始旅程吧。</p>
                <button class="ghost" id="signUp" type="button">注册</button>
            </div>
        </div>
    </div>
</div>

<script>
    const signUpButton = document.getElementById("signUp");
    const signInButton = document.getElementById("signIn");
    const container = document.getElementById("container");

    signUpButton.addEventListener("click", () => container.classList.add("right-panel-active"));

    signInButton.addEventListener("click", () => container.classList.remove("right-panel-active"));
</script>

</body>
</html>
