package app;

public class ApresentacaoCarrinho {
    public void colocarInformacoesCarrinho(HTTPServletRequest request) {
        Carrinho c = CookieFactory.criarCarrinho(request);

        //seta os valores de valor e quntidade do carrinho de compras
        request.setAttribute("valor", c.getValor());
        request.setAttribute("qtd", c.getTamanho());

        if(request.getAttribute("username") == null) {
            request.setAttribute("userCarrinho", c.getNomeUsuario());
        } else {
            request.setAttribute("userCarrinho", request.getAttribute("username"));
        }

    }