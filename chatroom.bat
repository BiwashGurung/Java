@echo off



title Chatroom

:join

cls
color a
echo chatroom
set/p username= Enter Your Name:
ecgo %username% Joined! >> Chat
goto Chatroom
pause

:Chatroom
cls
color a
echo Chatroom
Type Chat
set /p Input= Say something or Press enter refresh
echo %username%:%Input%>> Chat
goto Chatroom
pAUSE