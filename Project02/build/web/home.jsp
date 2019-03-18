<%-- 
    Document   : home
    Created on : 16/03/2019, 12:19:43
    Author     : Manoel Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!Doctype html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <title>Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
              crossorigin="anonymous">

        <style>

            div#sac {
                position: absolute;
                left: 100px;
                top: 200px;
                width: 350px;
                height: 500px;
                border: solid 0px;
                border-radius: 50px;
                background-color: white;
                padding: 15px;
                box-shadow: 1px 1px 15px black;

            }

            div#americana {
                position: absolute;
                left: 450px;
                top: 200px;
                width: 350px;
                height: 500px;
                border: solid 0px;
                border-radius: 50px;
                background-color: white;
                padding: 15px;
                margin-left: 50px;
                box-shadow: 1px 1px 15px black;
            }
            div#price{
                position: absolute;
                left: 850px;
                top: 200px;
                width: 350px;
                height: 500px;
                border: solid 0px;
                border-radius: 50px;
                background-color: white;
                padding: 15px;
                margin-left: 50px;
                box-shadow: 1px 1px 15px black;
            }
            div#sac:hover{
                background-color: rgb(219, 219, 219);
            }
            div#americana:hover{
                background-color: rgb(219, 219, 219);
            }
            div#price:hover{
                background-color: rgb(219, 219, 219);
            }

            p#tit-sac {
                position: absolute;
                left: 80px;
                font-size: 18px;
            }

            p#tit-americana {
                position: absolute;
                left: 80px;
                font-size: 18px;
            }

            p#tit-price{
                position: absolute;
                left: 150px;
                font-size: 20px;
            }

            p#cont-sac {
                position: absolute;
                top: 60px;
                left: 5px;
                font-size: 15px;
                text-align: justify;
                text-indent: 0px;
                padding: 20px;
            }

            p#cont-americana {
                position: absolute;
                top: 60px;
                text-align: justify;
                left: 5px;
                font-size: 15px;
                padding: 20px;
            }

            p#cont-price {
                position: absolute;
                top: 60px;
                text-align: justify;
                left: 5px;
                font-size: 15px;
                padding: 20px;
            }
            #botao-sac{
                position: absolute;
                top: 350px;
                left: 80px;
            }
            #botao-americana{
                position: absolute;
                top: 350px;
                left: 80px;
            }
            #botao-price{
                position: absolute;
                top: 350px;
                left: 140px;
            }

        </style>

    </head>

    <body>

        <%@include file = "WEB-INF/jspf/menu.jspf"%>

        <div id="sac">
            <p id="tit-sac"><b>Amortização Constante</b></p>
            <p id="cont-sac">O Sistema de Amortização Constante ficou bastante conhecido no Brasil por ser utilizado
                no SFH (Sistema Financeiro de Habitação). Sabe aquele financiamento, de um imóvel por exemplo, que a
                parcela vai reduzindo com o passar dos anos? Pois então, a definição das parcelas neste tipo de
                financiamento é baseada na tabela SAC. Entenda no decorrer deste artigo o que é tabela SAC e como funcionam
                os cálculos neste sistema.</p>
            <input id="botao-sac" type="submit" value="Amortização Constante" class="btn btn-primary" onclick="location.href = 'amortizacao-constante.jsp'">
        </div>

        <div id="americana">
            <p id="tit-americana"><b>Amortização Americana</b></p>
            <p id="cont-americana">O Sistema Americano de Amortização é um tipo de quitação de empréstimo que favorece
                aqueles
                que desejam pagar o valor principal através de uma única parcela, porém os juros devem ser pagos
                periodicamente ou, dependendo do contrato firmado entre as partes, os juros são capitalizados e pagos junto
                ao valor principal.</p>
            <input id="botao-americana" type="submit" value="Amortização Americana" class="btn btn-primary" onclick="location.href = 'amortizacao-americana.jsp'">
        </div>

        <div id="price">
            <p id="tit-price"><b>Price</b></p>
            <p id="cont-price">A tabela Price é, essencialmente, um sistema de amortização — que consiste na forma
                com que uma pessoa quita a dívida obtida de um empréstimo tomado de alguma instituição financeira.
                Ao contratar uma linha de crédito, o cliente e a empresa estabelecem, por contrato, a maneira com
                que a dívida total — amortização, juros e seguros — será quitada.</p>
            <input id="botao-price" type="submit" value="Price" class="btn btn-primary" onclick="location.href = 'tabela-price.jsp'">
        </div>

        <footer>
            <!-- JavaScript (Opcional) -->
            <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
        </footer>

    </body>

</html>
