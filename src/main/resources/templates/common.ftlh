<#import "/spring.ftl" as spring/>
<#macro page>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Hackathon</title>
        <link rel="stylesheet" type="text/css" href="<@spring.url '/css/datatable.css'/>">
    </head>
    <body>
    <header>
        <a href="/"><img src="<@spring.url '/img/logo.png'/>" alt="Codeforces" title="Codeforces"/></a>
        <div class="languages">
            <a href="#"><img src="<@spring.url '/img/gb.png'/>" alt="In English" title="In English"/></a>
            <a href="#"><img src="<@spring.url '/img/ru.png'/>" alt="In Russian" title="In Russian"/></a>
        </div>
        <div class="enter-or-register-box">
        </div>
        <nav>
            <ul>
                <li><a href="/">Home</a></li>
                    <li><a href="/users">Users</a></li>
                    <li><a href="/notices">Notices</a></li>
                    <li><a href="/notice">Add Notice</a></li>
            </ul>
        </nav>
    </header>
    <div class="middle">
        <aside>
        </aside>
        <main>
            <#nested/>
        </main>
    </div>
    <footer>
        <a href="#">Hackathon</a> &copy; 2019 by Здравствуй дерево ${text!}
    </footer>
    </body>
    </html>
</#macro>