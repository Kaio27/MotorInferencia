package gui;

import base.*;
import estruturas.*;
import java.util.ArrayList;
import motor.*;

public class Main {
    
    public static void main(String[] args) throws Exception {

        Base base = new Base();
        
        
        ArrayList<String> valores_jogador = new ArrayList();
        valores_jogador.add("Gabriel Toledo");
        valores_jogador.add("Oleksandr Kostylev");
        valores_jogador.add("Fernando de Alvarenga");
        valores_jogador.add("Marcelo David");
        valores_jogador.add("Epitácio de Melo");
        valores_jogador.add("João Vasconcellos");
        valores_jogador.add("Denis Kostin");
        valores_jogador.add("Ladislav Kovács");
        valores_jogador.add("Ioann Sukhariev");
        valores_jogador.add("Egor Vasilyev");
        valores_jogador.add("Julia Kiran");
        valores_jogador.add("Ksenia  Kluenkova");
        valores_jogador.add("Michaela Lintrup");
        valores_jogador.add("Zainab Turkie");
        valores_jogador.add("Anna Ananikova");
        valores_jogador.add("Emmalee Garrido");
        valores_jogador.add("Carolynn Noquez");
        valores_jogador.add("Amanda Smith");
        valores_jogador.add("Mounira Dobie");
        valores_jogador.add("Catherine Leroux");
        valores_jogador.add("Lane Roberts");
        valores_jogador.add("Adam Eckel");
        valores_jogador.add("Randal Stark");
        valores_jogador.add("Daniel Graeser");
        valores_jogador.add("Andreas Højsleth");
        valores_jogador.add("Nicolai Hvilshøj Reedtz");
        valores_jogador.add("Peter Rothmann");
        valores_jogador.add("Markus Kjærbye");
        valores_jogador.add("Lukas Egholm Rossander");
        valores_jogador.add("Mathias Sommer Lauridsen");
        valores_jogador.add("Kristian Wienecke");
        valores_jogador.add("René Borg");
        valores_jogador.add("Emil Hoffmann Reif");
        valores_jogador.add("Philip Aistrup");
        valores_jogador.add("Håvard Nygaard");
        valores_jogador.add("Fabien Fiey");
        valores_jogador.add("Aleksi Jalli");
        valores_jogador.add("Pedro Vilarinho");
        valores_jogador.add("Matheus Baronti Monteiro Borges");
        valores_jogador.add("Thúlio Carlos");
        valores_jogador.add("Gabriel Santos Bohm");
        valores_jogador.add("Pedro Gama");
        valores_jogador.add("Caio Almeida");
        valores_jogador.add("Felipe Gonçalves");
        valores_jogador.add("Gabriel Claumann");
        valores_jogador.add("Hugo Padioleau");
        valores_jogador.add("Felipe Noronha");
        valores_jogador.add("Felipe Zhao");
        valores_jogador.add("Gabriel Henud");
        valores_jogador.add("Murilo Alves");
        valores_jogador.add("Søren Bjerg");
        valores_jogador.add("Andy Dinh");
        valores_jogador.add("Marcus Hill");
        valores_jogador.add("Jason Tran");
        valores_jogador.add("Yiliang Peng");
        valores_jogador.add("William Hartman");
        valores_jogador.add("Enrique Cedeño Martínez");
        
        Variavel jogador = new Variavel(true, "jogador", "m", valores_jogador);
        
        base.addVariavel(jogador);
        
        ArrayList<String> valores_nacionalidade = new ArrayList();
        valores_nacionalidade.add("Brasil");
        valores_nacionalidade.add("Russia");
        valores_nacionalidade.add("Ucrania");
        valores_nacionalidade.add("Canada");
        valores_nacionalidade.add("Dinamarca");
        valores_nacionalidade.add("Suécia");
        valores_nacionalidade.add("Estados Unidos");
        valores_nacionalidade.add("Eslováquia");
        valores_nacionalidade.add("Suecia");
        valores_nacionalidade.add("Escócia");
        valores_nacionalidade.add("França");
        valores_nacionalidade.add("Finlandia");
        valores_nacionalidade.add("Espanha");
        Variavel nacionalidade = new Variavel(false, "nacionalidade", "u", valores_nacionalidade);
        
        base.addVariavel(nacionalidade);
        
        ArrayList<String> valores_time_atual = new ArrayList();
        valores_time_atual.add("Key Stars");
        valores_time_atual.add("Sk Gaming");
        valores_time_atual.add("Natus Vinceres");
        valores_time_atual.add("Team Secret");
        valores_time_atual.add("Team Diginitas");
        valores_time_atual.add("Cloud 9");
        valores_time_atual.add("Astralis");
        valores_time_atual.add("North");
        valores_time_atual.add("Faze Clan");
        Variavel time_atual = new Variavel(false, "time atual", "u", valores_time_atual);
        
        base.addVariavel(time_atual);
        
        ArrayList<String> valores_genero = new ArrayList();
        valores_genero.add("Masculino");
        valores_genero.add("Feminino");
        Variavel genero = new Variavel(false, "genero", "u", valores_genero);
        
        base.addVariavel(genero);
        
        ArrayList<String> valores_jogador_jogando = new ArrayList();
        valores_jogador_jogando.add("Sim");
        valores_jogador_jogando.add("Não");
        Variavel jogador_jogando = new Variavel(false, "jogador jogando", "u", valores_jogador_jogando);
        
        base.addVariavel(jogador_jogando);
        
        ArrayList<String> valores_jogador_jovem = new ArrayList();
        valores_jogador_jovem.add("Sim");
        valores_jogador_jovem.add("Não");
        Variavel jogador_jovem = new Variavel(false, "jogador jovem", "u", valores_jogador_jovem);
        
        base.addVariavel(jogador_jovem);
        
        ArrayList<String> valores_jogador_experiente = new ArrayList();
        valores_jogador_experiente.add("Muito");
        valores_jogador_experiente.add("Médio");
        valores_jogador_experiente.add("Pouco");
        Variavel jogador_experiente = new Variavel(false, "jogador experiente", "u", valores_jogador_experiente);
        
        base.addVariavel(jogador_experiente);
        
        ArrayList<String> valores_premios = new ArrayList();
        valores_premios.add("Baixo");
        valores_premios.add("Alto");
        valores_premios.add("Médio");
        Variavel premios = new Variavel(false, "jogador experiente", "u", valores_premios);
        
        base.addVariavel(premios);
        
        ArrayList<String> valores_inicio_carreira = new ArrayList();
        valores_inicio_carreira.add("2004");
        valores_inicio_carreira.add("2013");
        valores_inicio_carreira.add("2012");
        valores_inicio_carreira.add("2009");
        valores_inicio_carreira.add("2007");
        valores_inicio_carreira.add("2014");
        valores_inicio_carreira.add("2015");
        valores_inicio_carreira.add("2008");
        valores_inicio_carreira.add("2016");
        valores_inicio_carreira.add("2011");
        valores_inicio_carreira.add("2010");
        Variavel inicio_carreira = new Variavel(false, "Inicio da Carreira", "u", valores_inicio_carreira);
        
        base.addVariavel(inicio_carreira);  
        
        ArrayList<String> valores_jogos = new ArrayList();
        valores_jogos.add("League of Legends");
        valores_jogos.add("Overwatch");
        valores_jogos.add("Global Offensive");
        Variavel jogos = new Variavel(false, "jogos", "u", valores_jogos);
        
        base.addVariavel(jogos);
        
        ArrayList<String> valores_instabilidade = new ArrayList();
        valores_instabilidade.add("0;60");
        valores_instabilidade.add("Instavel");
        valores_instabilidade.add("Estavel");
        Variavel instabilidade = new Variavel(false, "instabilidade", "u", valores_instabilidade);
        
        base.addVariavel(instabilidade);
        
        ArrayList<String> valores_jogador_apelido = new ArrayList();
        valores_jogador_apelido.add("Fallen");
        valores_jogador_apelido.add("s1mple");
        valores_jogador_apelido.add("fer");
        valores_jogador_apelido.add("coldzera");
        valores_jogador_apelido.add("Taco");
        valores_jogador_apelido.add("felps");
        valores_jogador_apelido.add("seized");
        valores_jogador_apelido.add("Guardian");
        valores_jogador_apelido.add("Edward");
        valores_jogador_apelido.add("flamie");
        valores_jogador_apelido.add("juliano");
        valores_jogador_apelido.add("vilga");
        valores_jogador_apelido.add("mimimicheater");
        valores_jogador_apelido.add("zAAz");
        valores_jogador_apelido.add("Ant1ka");
        valores_jogador_apelido.add("Emuhleet");
        valores_jogador_apelido.add("artStar");
        valores_jogador_apelido.add("rain");
        valores_jogador_apelido.add("GooseBreeder");
        valores_jogador_apelido.add("Cath");
        valores_jogador_apelido.add("Surefour");
        valores_jogador_apelido.add("Adam");
        valores_jogador_apelido.add("Roolf");
        valores_jogador_apelido.add("Gods");
        valores_jogador_apelido.add("Xyp9x");
        valores_jogador_apelido.add("dev1ce");
        valores_jogador_apelido.add("dupreeh");
        valores_jogador_apelido.add("Kjaerbye");
        valores_jogador_apelido.add("gla1ve");
        valores_jogador_apelido.add("MSL");
        valores_jogador_apelido.add("k0nfig");
        valores_jogador_apelido.add("cajunb");
        valores_jogador_apelido.add("Magisk");
        valores_jogador_apelido.add("aizy");
        valores_jogador_apelido.add("rain");
        valores_jogador_apelido.add("kioShiMa");
        valores_jogador_apelido.add("allu");
        valores_jogador_apelido.add("Ziriguidun");
        valores_jogador_apelido.add("Mylon");
        valores_jogador_apelido.add("SirT");
        valores_jogador_apelido.add("Kami");
        valores_jogador_apelido.add("Matsukaze");
        valores_jogador_apelido.add("Loop");
        valores_jogador_apelido.add("brTT");
        valores_jogador_apelido.add("tockers");
        valores_jogador_apelido.add("Dioud");
        valores_jogador_apelido.add("YoDa");
        valores_jogador_apelido.add("Yang");
        valores_jogador_apelido.add("Revolta");
        valores_jogador_apelido.add("Takeshi");
        valores_jogador_apelido.add("Bjergsen");
        valores_jogador_apelido.add("Reginald");
        valores_jogador_apelido.add("Dyrus");
        valores_jogador_apelido.add("WildTurtle");
        valores_jogador_apelido.add("Doublelift");
        valores_jogador_apelido.add("Meteos");
        valores_jogador_apelido.add("Xpeke");
        Variavel apelido = new Variavel(false, "Apelido Jogador", "u", valores_jogador_apelido);
        
        base.addVariavel(apelido);
        
        ArrayList<String> valores_idade = new ArrayList();
        valores_idade.add("19;29");
        Variavel idade = new Variavel(false, "idade", "n", valores_idade);
        
        base.addVariavel(idade);
       
        ArrayList<String> valores_tempo_profissional = new ArrayList();
        valores_tempo_profissional.add("1;13");
        Variavel tempo_profissional = new Variavel(false, "tempo como Profissional", "n", valores_tempo_profissional);
        
        base.addVariavel(tempo_profissional);
        
        ArrayList<String> valores_tempo_meses = new ArrayList();
        valores_tempo_meses.add("3;60");
        Variavel tempo_meses = new Variavel(false, "tempo medio meses", "n", valores_tempo_meses);
        
        base.addVariavel(tempo_meses);
        
        ArrayList<String> valores_premiacao = new ArrayList();
        valores_premiacao.add("1800;1000000");
        Variavel premiacao = new Variavel(false, "premiaçao", "n", valores_premiacao);
        
        base.addVariavel(premiacao);
        
        ArrayList<String> valores_quantidade_times = new ArrayList();
        valores_quantidade_times.add("1;24");
        Variavel quantidade_times = new Variavel(false, "premiaçao", "n", valores_quantidade_times);
        
        base.addVariavel(quantidade_times);
        
        /// ################################################################
        /// # REGRAS                                                       #
        /// ################################################################
        
        ArrayList<Antecedente> antecedentes_premios = new ArrayList();
        Antecedente antecedentes_premios_1 = new Antecedente(premiacao, "<", "50000");
        antecedentes_premios.add(antecedentes_premios_1);
        ArrayList<Consequente> consequentes_premios = new ArrayList();
        Consequente consequente_premios = new Consequente(premios, "Baixo");
        consequentes_premios.add(consequente_premios);
        Regra regra_premios = new Regra("Premios Baixo", antecedentes_premios, consequentes_premios);
        
        base.addRegra(regra_premios);
        
        ArrayList<Antecedente> antecedentes_premios_medio = new ArrayList();
        Antecedente antecedentes_premios_medio_1 = new Antecedente(premiacao, ">=", "50000");
        antecedentes_premios_medio.add(antecedentes_premios_medio_1);
      Antecedente antecedentes_premios_medio_2 = new Antecedente(premiacao, "<", "500000" , "E");
      antecedentes_premios_medio.add(antecedentes_premios_medio_2);
        ArrayList<Consequente> consequentes_premios_medio = new ArrayList();
        Consequente consequente_premios_medio = new Consequente(premios, "Médio");
        consequentes_premios_medio.add(consequente_premios_medio);
        Regra regra_premios_medio = new Regra("Premios Medio", antecedentes_premios_medio, consequentes_premios_medio);
        
        base.addRegra(regra_premios_medio);
        
        ArrayList<Antecedente> antecedentes_premios_alto = new ArrayList();
        Antecedente antecedentes_premios_alto_1 = new Antecedente(premiacao, ">", "50000");
        antecedentes_premios_alto.add(antecedentes_premios_alto_1);
        ArrayList<Consequente> consequentes_premios_alto = new ArrayList();
        Consequente consequente_premios_alto = new Consequente(premios, "Alto");
        consequentes_premios_alto.add(consequente_premios_alto);
        Regra regra_premios_alto = new Regra("Premios Alto", antecedentes_premios_alto, consequentes_premios_alto);
        
        base.addRegra(regra_premios_alto);
        
        ArrayList<Antecedente> antecedentes_tempo_meses = new ArrayList();
        Antecedente antecedentes_tempo_meses_1 = new Antecedente(tempo_meses, "<", "12");
        antecedentes_tempo_meses.add(antecedentes_tempo_meses_1);
        ArrayList<Consequente> consequentes_tempo_meses = new ArrayList();
        Consequente consequente_tempo_meses = new Consequente(instabilidade, "Instavel");
        consequentes_tempo_meses.add(consequente_tempo_meses);
        Regra regra_tempo_meses = new Regra("Jogador Instavel", antecedentes_tempo_meses, consequentes_tempo_meses);
        
        base.addRegra(regra_tempo_meses);
        
        ArrayList<Antecedente> antecedentes_tempo_medio_estavel = new ArrayList();
        Antecedente antecedentes_tempo_medio_estavel_1 = new Antecedente(tempo_meses, ">=", "12");
        antecedentes_tempo_medio_estavel.add(antecedentes_tempo_medio_estavel_1);
        ArrayList<Consequente> consequentes_tempo_medio_estavel = new ArrayList();
        Consequente consequente_tempo_medio_estavel = new Consequente(instabilidade, "Estavel");
        consequentes_tempo_medio_estavel.add(consequente_tempo_medio_estavel);
        Regra regra_tempo_medio_estavel = new Regra("Jogador Estavel", antecedentes_tempo_medio_estavel, consequentes_tempo_medio_estavel);
        
        base.addRegra(regra_tempo_medio_estavel);
        
        ArrayList<Antecedente> antecedentes_jogador_experiente = new ArrayList();
        Antecedente antecedentes_jogador_experiente_1 = new Antecedente(tempo_profissional, ">", "6");
        antecedentes_jogador_experiente.add(antecedentes_jogador_experiente_1);
        ArrayList<Consequente> consequentes_jogador_experiente = new ArrayList();
        Consequente consequente_jogador_experiente = new Consequente(jogador_experiente, "Muito");
        consequentes_jogador_experiente.add(consequente_jogador_experiente);
        Regra regra_jogador_experiente = new Regra("Jogador Muito Experiente", antecedentes_jogador_experiente, consequentes_jogador_experiente);
        
        base.addRegra(regra_jogador_experiente);
                
        ArrayList<Antecedente> antecedentes_jogador_medio_experiente = new ArrayList();
//        Antecedente antecedentes_jogador_medio_experiente_1 = new Antecedente(tempo_profissional, "<=", "6");
//        antecedentes_jogador_medio_experiente.add(antecedentes_jogador_medio_experiente_1);
        Antecedente antecedentes_jogador_medio_experiente_2 = new Antecedente(tempo_profissional, ">", "3" ,"E");
        antecedentes_jogador_medio_experiente.add(antecedentes_jogador_medio_experiente_2);
        ArrayList<Consequente> consequentes_jogador_medio_experiente = new ArrayList();
        Consequente consequente_jogador_medio_experiente = new Consequente(jogador_experiente, "Médio");
        consequentes_jogador_medio_experiente.add(consequente_jogador_medio_experiente);
        Regra regra_jogador_medio_experiente = new Regra("Jogador Medio Experiente", antecedentes_jogador_medio_experiente, consequentes_jogador_medio_experiente);

        base.addRegra(regra_jogador_medio_experiente);
        
        ArrayList<Antecedente> antecedentes_jogador_pouco_experiente = new ArrayList();
        Antecedente antecedentes_jogador_pouco_experiente_1 = new Antecedente(tempo_profissional, "<=", "3");
        antecedentes_jogador_pouco_experiente.add(antecedentes_jogador_pouco_experiente_1);
        ArrayList<Consequente> consequentes_jogador_pouco_experiente = new ArrayList();
        Consequente consequente_jogador_pouco_experiente = new Consequente(jogador_experiente, "Pouco");
        consequentes_jogador_pouco_experiente.add(consequente_jogador_pouco_experiente);
        Regra regra_jogador_pouco_experiente = new Regra("Jogador pouco Experiente", antecedentes_jogador_pouco_experiente, consequentes_jogador_pouco_experiente);

        base.addRegra(regra_jogador_pouco_experiente);
        
        ArrayList<Antecedente> antecedentes_jogador_jovem = new ArrayList();
        Antecedente antecedentes_jogador_jovem_1 = new Antecedente(idade, "<", "25");
        antecedentes_jogador_jovem.add(antecedentes_jogador_jovem_1);
        ArrayList<Consequente> consequentes_jogador_jovem = new ArrayList();
        Consequente consequente_jogador_jovem = new Consequente(jogador_jovem, "Sim");
        consequentes_jogador_jovem.add(consequente_jogador_jovem);
        Regra regra_jogador_jovem = new Regra("Jogador Jovem", antecedentes_jogador_jovem, consequentes_jogador_jovem);

        base.addRegra(regra_jogador_jovem);
        
        ArrayList<Antecedente> antecedentes_jogador_nao_jovem = new ArrayList();
        Antecedente antecedentes_jogador_nao_jovem_1 = new Antecedente(idade, ">=", "25");
        antecedentes_jogador_nao_jovem.add(antecedentes_jogador_nao_jovem_1);
        ArrayList<Consequente> consequentes_jogador_nao_jovem = new ArrayList();
        Consequente consequente_jogador_nao_jovem = new Consequente(jogador_jovem, "Não");
        consequentes_jogador_nao_jovem.add(consequente_jogador_nao_jovem);
        Regra regra_jogador_nao_jovem = new Regra("Jogador nao Jovem", antecedentes_jogador_nao_jovem, consequentes_jogador_nao_jovem);

        base.addRegra(regra_jogador_nao_jovem);
        
        ArrayList<Antecedente> antecedentes_var1 = new ArrayList();
        Antecedente antecedente_var1_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var1.add(antecedente_var1_1);
        Antecedente antecedente_var1_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var1.add(antecedente_var1_2);
        Antecedente antecedente_var1_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var1.add(antecedente_var1_3);
        Antecedente antecedente_var1_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var1.add(antecedente_var1_4);
        Antecedente antecedente_var1_5 = new Antecedente(apelido, "=", "Fallen", "E");
        antecedentes_var1.add(antecedente_var1_5);
        Antecedente antecedente_var1_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var1.add(antecedente_var1_6);
        Antecedente antecedente_var1_7 = new Antecedente(jogador_experiente, "=", "Muito", "E");
        antecedentes_var1.add(antecedente_var1_7);
        Antecedente antecedente_var1_8 = new Antecedente(jogador_jovem, "=", "Não", "E");
        antecedentes_var1.add(antecedente_var1_8);
        Antecedente antecedente_var1_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var1.add(antecedente_var1_9);
        ArrayList<Consequente> consequentes_var1 = new ArrayList();
        Consequente consequente_var1 = new Consequente(jogador, "Gabriel Toledo");
        consequentes_var1.add(consequente_var1);
        Regra var1 = new Regra("Gabriel Toledo", antecedentes_var1, consequentes_var1);

        base.addRegra(var1);

        
        ArrayList<Antecedente> antecedentes_var2 = new ArrayList();
        Antecedente antecedente_var2_1 = new Antecedente(nacionalidade, "=", "Ucrania");
        antecedentes_var2.add(antecedente_var2_1);
        Antecedente antecedente_var2_2 = new Antecedente(time_atual, "=", "Natus Vinceres", "E");
        antecedentes_var2.add(antecedente_var2_2);
        Antecedente antecedente_var2_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var2.add(antecedente_var2_3);
        Antecedente antecedente_var2_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var2.add(antecedente_var2_4);
        Antecedente antecedente_var2_5 = new Antecedente(apelido, "=", "s1mple", "E");
        antecedentes_var2.add(antecedente_var2_5);
        Antecedente antecedente_var2_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var2.add(antecedente_var2_6);
        Antecedente antecedente_var2_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var2.add(antecedente_var2_7);
        Antecedente antecedente_var2_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var2.add(antecedente_var2_8);
        Antecedente antecedente_var2_9 = new Antecedente(premios, "=", "Médio", "E");
        antecedentes_var2.add(antecedente_var2_9);
        ArrayList<Consequente> consequentes_var2 = new ArrayList();
        Consequente consequente_var2 = new Consequente(jogador, "Oleksandr Kostylev");
        consequentes_var2.add(consequente_var2);
        Regra var2 = new Regra("Oleksandr Kostylev", antecedentes_var2, consequentes_var2);

        base.addRegra(var2);
       
        ArrayList<Antecedente> antecedentes_var3 = new ArrayList();
        Antecedente antecedente_var3_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var3.add(antecedente_var3_1);
        Antecedente antecedente_var3_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var3.add(antecedente_var3_2);
        Antecedente antecedente_var3_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var3.add(antecedente_var3_3);
        Antecedente antecedente_var3_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var3.add(antecedente_var3_4);
        Antecedente antecedente_var3_5 = new Antecedente(apelido, "=", "fer", "E");
        antecedentes_var3.add(antecedente_var3_5);
        Antecedente antecedente_var3_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var3.add(antecedente_var3_6);
        Antecedente antecedente_var3_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var3.add(antecedente_var3_7);
        Antecedente antecedente_var3_8 = new Antecedente(jogador_jovem, "=", "Não", "E");
        antecedentes_var3.add(antecedente_var3_8);
        Antecedente antecedente_var3_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var3.add(antecedente_var3_9);
        ArrayList<Consequente> consequentes_var3 = new ArrayList();
        Consequente consequente_var3 = new Consequente(jogador, "Fernando de Alvarenga");
        consequentes_var3.add(consequente_var3);
        Regra var3 = new Regra("Fernado de Alvarenga", antecedentes_var3, consequentes_var3);

        base.addRegra(var3);

        ArrayList<Antecedente> antecedentes_var4 = new ArrayList();
        Antecedente antecedente_var4_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var4.add(antecedente_var4_1);
        Antecedente antecedente_var4_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var4.add(antecedente_var4_2);
        Antecedente antecedente_var4_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var4.add(antecedente_var4_3);
        Antecedente antecedente_var4_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var4.add(antecedente_var4_4);
        Antecedente antecedente_var4_5 = new Antecedente(apelido, "=", "coldzera", "E");
        antecedentes_var4.add(antecedente_var4_5);
        Antecedente antecedente_var4_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var4.add(antecedente_var4_6);
        Antecedente antecedente_var4_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var4.add(antecedente_var4_7);
        Antecedente antecedente_var4_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var4.add(antecedente_var4_8);
        Antecedente antecedente_var4_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var4.add(antecedente_var4_9);
        ArrayList<Consequente> consequentes_var4 = new ArrayList();
        Consequente consequente_var4 = new Consequente(jogador, "Marcelo David");
        consequentes_var4.add(consequente_var4);
        Regra var4 = new Regra("Marcelo David", antecedentes_var4, consequentes_var4);

        base.addRegra(var4);
        
        ArrayList<Antecedente> antecedentes_var5 = new ArrayList();
        Antecedente antecedente_var5_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var5.add(antecedente_var5_1);
        Antecedente antecedente_var5_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var5.add(antecedente_var5_2);
        Antecedente antecedente_var5_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var5.add(antecedente_var5_3);
        Antecedente antecedente_var5_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var5.add(antecedente_var5_4);
        Antecedente antecedente_var5_5 = new Antecedente(apelido, "=", "felps", "E");
        antecedentes_var5.add(antecedente_var5_5);
        Antecedente antecedente_var5_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var5.add(antecedente_var5_6);
        Antecedente antecedente_var5_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var5.add(antecedente_var5_7);
        Antecedente antecedente_var5_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var5.add(antecedente_var5_8);
        Antecedente antecedente_var5_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var5.add(antecedente_var5_9);
        ArrayList<Consequente> consequentes_var5 = new ArrayList();
        Consequente consequente_var5 = new Consequente(jogador, "João Vasconcellos");
        consequentes_var5.add(consequente_var5);
        Regra var5 = new Regra("João Vascocellos", antecedentes_var5, consequentes_var5);
        
  
        base.addRegra(var5);
        
        
        ArrayList<Antecedente> antecedentes_var6 = new ArrayList();
        Antecedente antecedente_var6_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var6.add(antecedente_var6_1);
        Antecedente antecedente_var6_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var6.add(antecedente_var6_2);
        Antecedente antecedente_var6_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var6.add(antecedente_var6_3);
        Antecedente antecedente_var6_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var6.add(antecedente_var6_4);
        Antecedente antecedente_var6_5 = new Antecedente(apelido, "=", "Taco", "E");
        antecedentes_var6.add(antecedente_var6_5);
        Antecedente antecedente_var6_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var6.add(antecedente_var6_6);
        Antecedente antecedente_var6_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var6.add(antecedente_var6_7);
        Antecedente antecedente_var6_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var6.add(antecedente_var6_8);
        Antecedente antecedente_var6_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var6.add(antecedente_var6_9);
        ArrayList<Consequente> consequentes_var6 = new ArrayList();
        Consequente consequente_var6 = new Consequente(jogador, "Epitácio de Melo");
        consequentes_var6.add(consequente_var6);
        Regra var6 = new Regra("Epitácio de Melo", antecedentes_var6, consequentes_var6);
        
        base.addRegra(var6);
        
        
        ArrayList<Antecedente> antecedentes_var7 = new ArrayList();
        Antecedente antecedente_var7_1 = new Antecedente(nacionalidade, "=", "Russia");
        antecedentes_var7.add(antecedente_var7_1);
        Antecedente antecedente_var7_2 = new Antecedente(time_atual, "=", "Natus Vinceres", "E");
        antecedentes_var7.add(antecedente_var7_2);
        Antecedente antecedente_var7_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var7.add(antecedente_var7_3);
        Antecedente antecedente_var7_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var7.add(antecedente_var7_4);
        Antecedente antecedente_var7_5 = new Antecedente(apelido, "=", "seized", "E");
        antecedentes_var7.add(antecedente_var7_5);
        Antecedente antecedente_var7_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var7.add(antecedente_var7_6);
        Antecedente antecedente_var7_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var7.add(antecedente_var7_7);
        Antecedente antecedente_var7_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var7.add(antecedente_var7_8);
        Antecedente antecedente_var7_9 = new Antecedente(premios, "=", "Médio", "E");
        antecedentes_var7.add(antecedente_var7_9);
        ArrayList<Consequente> consequentes_var7 = new ArrayList();
        Consequente consequente_var7 = new Consequente(jogador, "Denis Kostin");
        consequentes_var7.add(consequente_var7);
        Regra var7 = new Regra("Denis Kostin", antecedentes_var7, consequentes_var7);
        
        base.addRegra(var7);
        
         ArrayList<Antecedente> antecedentes_var8 = new ArrayList();
        Antecedente antecedente_var8_1 = new Antecedente(nacionalidade, "=", "Suécia");
        antecedentes_var8.add(antecedente_var8_1);
        Antecedente antecedente_var8_2 = new Antecedente(time_atual, "=", "Team Secret", "E");
        antecedentes_var8.add(antecedente_var8_2);
        Antecedente antecedente_var8_3 = new Antecedente(genero, "=", "Feminino", "E");
        antecedentes_var8.add(antecedente_var8_3);
        Antecedente antecedente_var8_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var8.add(antecedente_var8_4);
        Antecedente antecedente_var8_5 = new Antecedente(apelido, "=", "mimimicheater", "E");
        antecedentes_var8.add(antecedente_var8_5);
        Antecedente antecedente_var8_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var8.add(antecedente_var8_6);
        Antecedente antecedente_var8_7 = new Antecedente(jogador_experiente, "=", "Pouco", "E");
        antecedentes_var8.add(antecedente_var8_7);
        Antecedente antecedente_var8_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var8.add(antecedente_var8_8);
        Antecedente antecedente_var8_9 = new Antecedente(premios, "=", "Baixo", "E");
        antecedentes_var8.add(antecedente_var8_9);
        ArrayList<Consequente> consequentes_var8 = new ArrayList();
        Consequente consequente_var8 = new Consequente(jogador, "Michaela Lintrup");
        consequentes_var8.add(consequente_var8);
        Regra var8 = new Regra("Michaela Lintrup", antecedentes_var8, consequentes_var8);
        
        base.addRegra(var8);
         
         
        System.out.println(base);
        
        MotorDeInferencia m = new MotorDeInferencia(base);
        m.start();
        
    }
    
}
