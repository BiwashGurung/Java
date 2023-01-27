@echo off
:1
color a
echo Hello, do you love me? (answer in yes/no)
set /p input=
if /i %input%==Yes goto love
if /i %input%==no goto hate
if /i not %input%== Yes,no goto 1

:lo
echo I love You Too...
echo See You Later
pause
exit

:hate
echo But I Love You... lol
echo You Just Got Hacked!
timeout 3
shutdown -s -t 10
