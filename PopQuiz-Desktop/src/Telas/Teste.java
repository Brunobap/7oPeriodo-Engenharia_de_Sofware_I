package Telas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Teste {

    @Test
    void testLoginFalhaParaUsuarioNaoCadastrado() {
TelaLogin telaLogin = new TelaLogin();
        
        // Definindo credenciais incorretas
// coccokao
        String emailIncorreto = "usuario_nao_cadastrado@exemplo.com";
        String senhaIncorreta = "senhaerrada";
        
        // Verifica se o método retorna falso para credenciais inválidas
        boolean resultado = telaLogin.validarLogin(emailIncorreto, senhaIncorreta);
        
        // Mensagem no console
        if (!resultado) {
            System.out.println("Teste de login falhou corretamente para um usuário não cadastrado.");
        } else {
            System.out.println("Teste de login falhou incorretamente para um usuário não cadastrado.");
        }

        // Verificação padrão do JUnit
        assertFalse(resultado, "O login deveria falhar para um usuário não cadastrado.");
    }
    
    @Test
    void testLoginSucessoParaUsuarioCadastrado() {
        TelaLogin telaLogin = new TelaLogin();
        
        // Definindo credenciais corretas
        String emailCorreto = "usuario@exemplo.com";
        String senhaCorreta = "senha123";
        
        // Verifica se o método retorna true para credenciais válidas
        boolean resultado = telaLogin.validarLogin(emailCorreto, senhaCorreta);
        
        // Mensagem no console
        if (resultado) {
            System.out.println("Teste de login bem-sucedido para um usuário cadastrado.");
        } else {
            System.out.println("Teste de login falhou para um usuário cadastrado.");
        }

        // Verificação padrão do JUnit
        assertTrue(resultado, "O login deveria ser bem-sucedido para um usuário cadastrado.");
    }}
