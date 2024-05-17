package br.edu.up.telas;

import br.edu.up.modelos.*;
import br.edu.up.controles.*;

public class Menu {
    private ControleClientes controle;
    private VisaoClientes visao;

    public Menu() {
        controle = new ControleClientes();
        visao = new VisaoClientes();
    }

    public void executarOpcao(int opcaoPrincipal) {
        int opcaoSecundaria;

        switch (opcaoPrincipal) {
            case 1:
                do {
                    visao.exibirMenuIncluir();
                    opcaoSecundaria = visao.lerOpcao();

                    switch (opcaoSecundaria) {
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
                            visao.mostrarMensagem("Voltando ao menu principal...");
                            break;
                        default:
                            visao.mostrarMensagem("Opção inválida!");
                            break;
                    }
                } while (opcaoSecundaria != 3);
                break;
            case 2: 
                do {
                    visao.exibirMenuMostrarDados();
                    opcaoSecundaria = visao.lerOpcao();

                    switch (opcaoSecundaria) {
                        case 1:
                            String codigoPessoa = visao.lerCodigoCliente();
                            Cliente clientePessoaEncontrado = controle.buscarCliente(codigoPessoa);
                            visao.mostrarDadosCliente(clientePessoaEncontrado);
                            break;
                        case 2:
                            String codigoEmpresa = visao.lerCodigoCliente();
                            Cliente clienteEmpresaEncontrado = controle.buscarCliente(codigoEmpresa);
                            visao.mostrarDadosCliente(clienteEmpresaEncontrado);
                            break;
                        case 3:
                            visao.mostrarMensagem("Voltando ao menu principal...");
                            break;
                        default:
                            visao.mostrarMensagem("Opção inválida!");
                            break;
                    }
                } while (opcaoSecundaria != 3);
                break;
            case 3:
                do {
                    visao.exibirMenuEmprestimo();
                    opcaoSecundaria = visao.lerOpcao();

                    switch (opcaoSecundaria) {
                        case 1:
                            String codigoPessoa = visao.lerCodigoCliente();
                            double valorEmprestimoPessoa = visao.lerValor();
                            if (controle.emprestarParaCliente(codigoPessoa, valorEmprestimoPessoa)) {
                                visao.mostrarMensagem("Empréstimo realizado com sucesso!");
                            } else {
                                visao.mostrarMensagem("Empréstimo não realizado! Valor excede o limite de crédito.");
                            }
                            break;
                        case 2:
                            String codigoEmpresa = visao.lerCodigoCliente();
                            double valorEmprestimoEmpresa = visao.lerValor();
                            if (controle.emprestarParaCliente(codigoEmpresa, valorEmprestimoEmpresa)) {
                                visao.mostrarMensagem("Empréstimo realizado com sucesso!");
                            } else {
                                visao.mostrarMensagem("Empréstimo não realizado! Valor excede o limite de crédito.");
                            }
                            break;
                        case 3:
                            visao.mostrarMensagem("Voltando ao menu principal...");
                            break;
                        default:
                            visao.mostrarMensagem("Opção inválida!");
                            break;
                    }
                } while (opcaoSecundaria != 3);
                break;
            case 4: 
                do {
                    visao.exibirMenuDevolucao();
                    opcaoSecundaria = visao.lerOpcao();

                    switch (opcaoSecundaria) {
                        case 1:
                            String codigoPessoa = visao.lerCodigoCliente();
                            double valorDevolucaoPessoa = visao.lerValor();
                            if (controle.devolverParaCliente(codigoPessoa, valorDevolucaoPessoa)) {
                                visao.mostrarMensagem("Devolução realizada com sucesso!");
                            } else {
                                visao.mostrarMensagem("Devolução não realizada! Valor inválido.");
                            }
                            break;
                        case 2:
                            String codigoEmpresa = visao.lerCodigoCliente();
                            double valorDevolucaoEmpresa = visao.lerValor();
                            if (controle.devolverParaCliente(codigoEmpresa, valorDevolucaoEmpresa)) {
                                visao.mostrarMensagem("Devolução realizada com sucesso!");
                            } else {
                                visao.mostrarMensagem("Devolução não realizada! Valor inválido.");
                            }
                            break;
                        case 3:
                            visao.mostrarMensagem("Voltando ao menu principal...");
                            break;
                        default:
                            visao.mostrarMensagem("Opção inválida!");
                            break;
                    }
                } while (opcaoSecundaria != 3);
                break;
            case 5:
                visao.mostrarMensagem("Saindo do programa...");
                break;
            default:
                visao.mostrarMensagem("Opção inválida!");
                break;
        }
    }
}
