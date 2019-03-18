<%-- 
    Document   : amortizacao-constante
    Created on : 16/03/2019, 12:22:12
    Author     : Manoel Rodriguez
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Amortização Constante</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
              crossorigin="anonymous">

        <style>
            div#form-sac{
                position: absolute;
                width: 300px;
                height: 400px;
                border: solid 0px;
                border-radius: 50px;
                box-shadow: 1px 1px 15px black;
                left: 200px;
                padding: 50px;
                top: 180px;
            }
            div#form-sac:hover{
                background-color: rgb(219, 219, 219);
            }
            input{
                margin: 10px;

            }
            input#botao{
                position: absolute;
                left: 50px;
            }
            p{
                font-size: 18px;
                position: absolute;
                top: 30px;
                margin-bottom: 30px;
            }
            div#campos{
                position: absolute;
                top: 100px;
            }

        </style>

    </head>

    <body>

        <%@include file = "WEB-INF/jspf/menu.jspf"%>

        <div id="form-sac">
            <p><b>Amortização Constante</b></p>
            <div id="campos">
                <form>
                    <input type="number" name="divida" placeholder="Dívida" required><br><br>
                    <input type="number" name="meses" placeholder="Meses" required><br><br>
                    <input type="number" name="juros" placeholder="Juros(%)" required><br><br>
                    <input type="submit" name="calcular" class="btn btn-primary" value="Calcular" id="botao">
                </form>
            </div>
        </div>

        <%if (request.getParameter("calcular") != null) {%>
        <%try {%>
        <%double divida = Double.parseDouble(request.getParameter("divida"));%>
        <%int meses = Integer.parseInt(request.getParameter("meses"));%>
        <%double taxa = Integer.parseInt(request.getParameter("juros"));%>
        <br><br>
        <%double amortizacao = divida / meses;%>
        <%double juros;%>
        <%double parcela;%>
        <%taxa = taxa / 100;%>
        <%DecimalFormat df = new DecimalFormat("#,##0.00");%>
        <table style="position: absolute; top: 190px; left: 700px; margin-bottom: 50px; box-shadow: 1px 1px 5px black; " border = "1">
            <tr><th>Mês</th><th>Parcela</th><th>Juros</th><th>Amortização</th><th>Dívida</th></tr>    
            <%for (int i = 0; i <= meses; i++) {%>
                <%if( i == 0){%>
                    <th> <%=i%> </th>
                    <td></td>                       
                    <td></td>
                    <td></td>
                    <td> <%=divida%> </td>
                <%};%>
                
                <%if(i > 0){%>
                <%juros = taxa * divida;%>
                <%parcela = juros + amortizacao;%>
                <tr>
                    <th> <%=i%> </th>
                    <td> <%=df.format(parcela)%> </td>                       
                    <td> <%=df.format(juros)%> </td>
                    <td> <%=df.format(amortizacao)%> </td>
                    <%divida = divida - amortizacao;%>
                    <td> <%=df.format(divida)%> </td>
                </tr>
                <%};%>

            <%}%>
        </table>
        <%} catch (Exception ex) {%>
        <h3 style = "color: red">Erro: <%=ex.getMessage()%></h3>
        <%}%>
        <%}%>



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