Dim Var1, Var2
Var1=InputBox("Quite Coder","TEXT TO SPEECH")
set Var2=CreateObject("sapi.spVoice")
Var2.speak Var1
