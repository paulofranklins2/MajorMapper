import java.util.ArrayList;
import java.util.List;

public class CourseChecker {

    public static void main(String[] args) {
        List<String> seCourseList = createSECourseList();
        List<String> csCourseList = createCSCourseList();
        List<String> eeCourseList = createEECourseList();

        compareAndPrintResults("CS", seCourseList, csCourseList);
        compareAndPrintResults("EE", seCourseList, eeCourseList);
        System.out.println("__________________________________");
        compareAndPrintResults("SE", csCourseList, seCourseList);
        compareAndPrintResults("EE", csCourseList, eeCourseList);
        System.out.println("__________________________________");
        compareAndPrintResults("SE", eeCourseList, seCourseList);
        compareAndPrintResults("CS", eeCourseList, csCourseList);
    }

    private static void compareAndPrintResults(String label, List<String> courseList1, List<String> courseList2) {
        List<String> presentCourses = courseList2.stream()
                .filter(courseList1::contains)
                .toList();

        int presentCount = presentCourses.size();
        int notPresentCount = courseList2.size() - presentCount;

        System.out.println(label + " courses present: " + presentCount);
        System.out.println(label + " courses not present: " + notPresentCount);
    }

    private static List<String> createSECourseList() {
        List<String> seCourseList = new ArrayList<>();
        seCourseList.add("Algoritmos E Programação Estruturada");
        seCourseList.add("Análise E Modelagem De Sistemas");
        seCourseList.add("Análise Orientada A Objetos");
        seCourseList.add("Arquitetura De Software");
        seCourseList.add("Arquitetura E Organização De Computadores");
        seCourseList.add("Bancos De Dados Não Relacionais");
        seCourseList.add("Computação Em Nuvem");
        seCourseList.add("Desenvolvimento De Sistemas E-Commerce");
        seCourseList.add("Desenvolvimento Mobile");
        seCourseList.add("Direito Cibernético");
        seCourseList.add("Engenharia De Requisitos");
        seCourseList.add("Engenharia De Software");
        seCourseList.add("Frameworks Para Desenvolvimento De Software");
        seCourseList.add("Gerenciamento E Qualidade De Software");
        seCourseList.add("Governança De Tecnologia Da Informação");
        seCourseList.add("Implementação De Projeto Web");
        seCourseList.add("Infraestrutura Ágil");
        seCourseList.add("Interface E Usabilidade");
        seCourseList.add("Linguagem De Programação");
        seCourseList.add("Linguagem Orientada A Objetos");
        seCourseList.add("Lógica Computacional");
        seCourseList.add("Modelagem De Dados");
        seCourseList.add("Programação E Desenvolvimento De Banco De Dados");
        seCourseList.add("Programação Web");
        seCourseList.add("Projeto De Software");
        seCourseList.add("Redes E Sistemas Distribuídos");
        seCourseList.add("Segurança E Auditoria De Sistemas");
        seCourseList.add("Segurança Em Engenharia De Software");
        seCourseList.add("Sistemas De Computação E De Informação");
        seCourseList.add("Sistemas Operacionais");
        seCourseList.add("Técnicas De Inteligência Artificial");
        seCourseList.add("Testes E Manutenção De Software");

        return seCourseList;
    }

    private static List<String> createCSCourseList() {
        List<String> csCourseList = new ArrayList<>();
        csCourseList.add("Algoritmos e Estrutura de Dados");
        csCourseList.add("Algoritmos e Estrutura de Dados Avançado");
        csCourseList.add("Algoritmos E Técnicas De Programação");
        csCourseList.add("Análise de Computabilidade e Complexidade de Algoritmos");
        csCourseList.add("Arquitetura E Organização De Computadores");
        csCourseList.add("Arquiteturas Paralelas e Distribuídas");
        csCourseList.add("Computação em Nuvem");
        csCourseList.add("Computação Gráfica e Processamento de Imagens");
        csCourseList.add("Desenvolvimento com Low Code");
        csCourseList.add("Desenvolvimento de E-Commerce com CMS");
        csCourseList.add("Desenvolvimento em Javascript");
        csCourseList.add("Engenharia de Software");
        csCourseList.add("Física Geral");
        csCourseList.add("Green It");
        csCourseList.add("Internet das Coisas");
        csCourseList.add("Linguagens Formais e Autômatos");
        csCourseList.add("Lógica E Matemática Computacional");
        csCourseList.add("Matemática Discreta");
        csCourseList.add("Métodos Matemáticos");
        csCourseList.add("Métodos Numéricos Aplicados");
        csCourseList.add("Modelagem de Dados");
        csCourseList.add("Optativa I");
        csCourseList.add("Optativa II");
        csCourseList.add("Programação em Banco de Dados");
        csCourseList.add("Programação Orientada a Objetos");
        csCourseList.add("Programação Orientada a Objetos II");
        csCourseList.add("Projeto de Extensão I - Ciência da Computação");
        csCourseList.add("Projeto de Extensão II - Ciência da Computação");
        csCourseList.add("Redes de Computadores");
        csCourseList.add("Segurança da Informação e de Redes");
        csCourseList.add("Sistemas de Computação e de Informação");
        csCourseList.add("Sistemas Digitais e Microprocessadores");
        csCourseList.add("Sistemas Distribuídos");
        csCourseList.add("Sistemas Operacionais");
        csCourseList.add("Sociedade Brasileira e Cidadania");
        return csCourseList;
    }

    private static List<String> createEECourseList() {
        List<String> eeCourseList = new ArrayList<>();
        eeCourseList.add("Eletromagnetismo");
        eeCourseList.add("Cálculo Diferencial e Integral II");
        eeCourseList.add("Trabalho de Conclusão de Curso");
        eeCourseList.add("Eletrônica Analógica");
        eeCourseList.add("Princípios de Eletricidade e Magnetismo");
        eeCourseList.add("Cálculo Diferencial e Integral");
        eeCourseList.add("Circuitos Elétricos");
        eeCourseList.add("Fenômenos de Transporte");
        eeCourseList.add("Desenho Técnico Projetivo");
        eeCourseList.add("Administração e Economia para Engenheiros");
        eeCourseList.add("Física Geral e Experimental - Energia");
        eeCourseList.add("Física Geral e Experimental - Mecânica");
        eeCourseList.add("Legislação, Segurança do Trabalho e Meio Ambiente");
        eeCourseList.add("Química e Ciência dos Materiais");
        eeCourseList.add("Sociedade Brasileira e Cidadania");
        eeCourseList.add("Est. Cur. Engenharia");
        eeCourseList.add("Algoritmos e Lógica de Programação");
        eeCourseList.add("Cálculo Diferencial e Integral III");
        eeCourseList.add("Optativa II");
        eeCourseList.add("Engenharia, Ciência e Tecnologia");
        eeCourseList.add("Redes de Comunicação Industrial");
        eeCourseList.add("Instalações Elétricas");
        eeCourseList.add("Compatibilidade e Interferência Eletromagnética");
        eeCourseList.add("Análise e Processamento de Sinais");
        eeCourseList.add("Cálculo Diferencial e Integral IV");
        eeCourseList.add("Eficiência Energética e Qualidade de Energia");
        eeCourseList.add("Internet das Coisas e Indústria 4.0");
        eeCourseList.add("Design Thinking e Inovação dos Modelos de Negócios");
        eeCourseList.add("ESG - Ambiental, Social e Governança na Engenharia");
        eeCourseList.add("Pensamento Analítico e Análise de Dados");
        eeCourseList.add("Optativa I");
        eeCourseList.add("Resistência dos Materiais");
        eeCourseList.add("Geração, Transmissão e Distribuição de Energia Elétrica");
        eeCourseList.add("Eletrônica e Circuitos de Potência");
        eeCourseList.add("Sistemas de Telecomunicações");
        eeCourseList.add("Automação de Processos Industriais");
        eeCourseList.add("Circuitos Elétricos Avançados");
        eeCourseList.add("Conversão Eletromagnética de Energia e Máquinas Elétricas");
        eeCourseList.add("Eletrônica Analógica Avançada");
        eeCourseList.add("Máquinas Elétricas Avançadas");
        eeCourseList.add("Materiais e Instrumentação Eletroeletrônica");
        eeCourseList.add("Métodos Matemáticos");
        eeCourseList.add("Modelagem e Controle de Sistemas");
        eeCourseList.add("Projeto de Extensão II - Engenharia Elétrica");
        eeCourseList.add("Projeto de Extensão III - Engenharia Elétrica");
        eeCourseList.add("Projeto de Extensão IV - Engenharia Elétrica");
        eeCourseList.add("Optativa III");
        eeCourseList.add("Sistemas Digitais e Microprocessadores");
        eeCourseList.add("Sistemas Elétricos de Potência");
        eeCourseList.add("Sistemas Elétricos de Potência Avançados");
        eeCourseList.add("Projeto de Extensão I - Engenharia Elétrica");
        eeCourseList.add("Optativa IV");
        eeCourseList.add("Optativa V");
        return eeCourseList;
    }
}
