package br.edu.up;

import br.edu.up.modelos.*;
import br.edu.up.telas.*;
import br.edu.up.controles.*;

public class Programa {
    public static void main(String[] args) {
        ControleClientes controle = new ControleClientes();
        VisaoClientes visao = new VisaoClientes();
        int opcao;

        do {
            visao.exibirMenu();
            opcao = visao.lerOpcao();

            switch (opcao) {
                case 1:
                    ClientePessoa clientePessoa = visao.lerDadosClientePessoa();
                    controle.incluirCliente(clientePessoa);
                    visao.mostrarMensagem("Cliente pessoa incluído com sucesso!");
                    break;
                case 2:
                    ClienteEmpresa clienteEmpresa = visao.lerDadosClienteEmpresa();
                    controle.incluirCliente(clienteEmpresa);
                    visao.mostrarMensagem("Cliente empresa incluído com sucesso!");
                    break;
                case 3:
                    String codigoPessoa = visao.lerCodigoCliente();
                    Cliente clientePessoaEncontrado = controle.buscarCliente(codigoPessoa);
                    visao.mostrarDadosCliente(clientePessoaEncontrado);
                    break;
                case 4:
                    String codigoEmpresa = visao.lerCodigoCliente();
                    Cliente clienteEmpresaEncontrado = controle.buscarCliente(codigoEmpresa);
                    visao.mostrarDadosCliente(clienteEmpresaEncontrado);
                    break;
                case 5:
                    codigoPessoa = visao.lerCodigoCliente();
                    double valorEmprestimoPessoa = visao.lerValor();
                    if (controle.emprestarParaCliente(codigoPessoa, valorEmprestimoPessoa)) {
                        visao.mostrarMensagem("Empréstimo realizado com sucesso!");
                    } else {
                        visao.mostrarMensagem("Empréstimo não realizado! Valor excede o limite de crédito.");
                    }
                    break;
                case 6:
                    codigoEmpresa = visao.lerCodigoCliente();
                    double valorEmprestimoEmpresa = visao.lerValor();
                    if (controle.emprestarParaCliente(codigoEmpresa, valorEmprestimoEmpresa)) {
                        visao.mostrarMensagem("Empréstimo realizado com sucesso!");
                    } else {
                        visao.mostrarMensagem("Empréstimo não realizado! Valor excede o limite de crédito.");
                    }
                    break;
                case 7:
                    codigoPessoa = visao.lerCodigoCliente();
                    double valorDevolucaoPessoa = visao.lerValor();
                    if (controle.devolverParaCliente(codigoPessoa, valorDevolucaoPessoa)) {
                        visao.mostrarMensagem("Devolução realizada com sucesso!");
                    } else {
                        visao.mostrarMensagem("Devolução não realizada! Valor inválido.");
                    }
                    break;
                case 8:
                    codigoEmpresa = visao.lerCodigoCliente();
                    double valorDevolucaoEmpresa = visao.lerValor();
                    if (controle.devolverParaCliente(codigoEmpresa, valorDevolucaoEmpresa)) {
                        visao.mostrarMensagem("Devolução realizada com sucesso!");
                    } else {
                        visao.mostrarMensagem("Devolução não realizada! Valor inválido.");
                    }
                    break;
                case 9:
                    visao.mostrarMensagem("Saindo do programa...");
                    break;
                default:
                    visao.mostrarMensagem("Opção inválida!");
                    break;
            }
        } while (opcao != 9);
    }
}
