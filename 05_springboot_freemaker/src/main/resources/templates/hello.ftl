<html>
<body>
<#assign x = "<test>">
<#macro m1>
m1: ${x}
</#macro>
<#escape x as x?html>
    <#macro m2>m2: ${x}</#macro>
${x}
    <@m1/>
</#escape>
${x}
<@m2/>

</body>
</html>