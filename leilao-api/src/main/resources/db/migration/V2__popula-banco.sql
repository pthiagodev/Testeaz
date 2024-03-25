INSERT INTO unidade (id, nome, created_at, updated_at)
VALUES
    (1, 'Clean Code: A Handbook of Agile Software Craftsmanship', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (2, 'Design Patterns: Elements of Reusable Object-Oriented Software', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (3, 'The Pragmatic Programmer: Your Journey to Mastery', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (4, 'Refactoring: Improving the Design of Existing Code', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (5, 'Code Complete: A Practical Handbook of Software Construction', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (6, 'Structure and Interpretation of Computer Programs', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (7, 'Clean Architecture: A Craftsman''s Guide to Software Structure and Design', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (8, 'Introduction to Algorithms', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (9, 'Test Driven Development: By Example', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (10, 'JavaScript: The Good Parts', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


INSERT INTO empresa (id, razao_social, cnpj, logradouro, municipio, numero, complemento, bairro, cep, telefone, email, site, usuario, senha, created_at, updated_at)
VALUES
    (1, 'Ambev S.A.', '12345678901234', 'Rua Barão de Aratanha', 'Fortaleza', '123', 'Sala 101', 'Centro', '60015-050', '85987654321', 'ambev@example.com', 'http://www.ambev.com.br', 'u_ambev', 's_ambev', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (2, 'Banco do Nordeste do Brasil S.A.', '23456789012345', 'Avenida Dr. Silas Munguba', 'Fortaleza', '456', 'Andar 10', 'Passaré', '60861-100', '85876543210', 'bnb@example.com', 'http://www.bnb.com.br', 'u_bnb', 's_bnb', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (3, 'Grendene S.A.', '34567890123456', 'Rua Pedro Grendene', 'Fortaleza', '789', 'Bloco B', 'Jardim América', '60411-280', '85765432109', 'grendene@example.com', 'http://www.grendene.com.br', 'u_grendene', 's_grendene', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (4, 'Hapvida Participações e Investimentos S.A.', '45678901234567', 'Avenida Oliveira Paiva', 'Fortaleza', '1011', 'Torre Business', 'Cidade dos Funcionários', '60822-300', '85654321098', 'hapvida@example.com', 'http://www.hapvida.com.br', 'u_hapvida', 's_hapvida', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (5, 'Marquise S.A.', '56789012345678', 'Rua Almirante Maximiniano da Fonseca', 'Fortaleza', '1213', 'Edifício Marquise', 'Meireles', '60160-280', '85432109876', 'marquise@example.com', 'http://www.marquise.com.br', 'u_marquise', 's_marquise', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (6, 'M. Dias Branco S.A. Indústria e Comércio de Alimentos', '67890123456789', 'Avenida Paranjana', 'Fortaleza', '1415', 'Bloco A', 'Serrinha', '60740-000', '85321098765', 'mdiasbranco@example.com', 'http://www.mdiasbranco.com.br', 'u_mdiasbranco', 's_mdiasbranco', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (7, 'Pague Menos S.A.', '78901234567890', 'Avenida Godofredo Maciel', 'Fortaleza', '1617', 'Sala 200', 'Maraponga', '60710-010', '85210987654', 'paguemenos@example.com', 'http://www.paguemenos.com.br', 'u_paguemenos', 's_paguemenos', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (8, 'Solar Coca-Cola Indústria e Comércio Ltda.', '89012345678901', 'Avenida Senador Virgílio Távora', 'Fortaleza', '1819', 'Conjunto 101', 'Aldeota', '60170-251', '85109876543', 'solarcocacola@example.com', 'http://www.solarcocacola.com.br', 'u_solarcocacola', 's_solarcocacola', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (9, 'Terra Networks Brasil S.A.', '90123456789012', 'Avenida Santos Dumont', 'Fortaleza', '2021', 'Bloco C', 'Papicu', '60175-051', '85098765432', 'terra@example.com', 'http://www.terra.com.br', 'u_terra', 's_terra', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (10, 'Zenir Móveis e Eletrodomésticos S.A.', '01234567890123', 'Avenida Washington Soares', 'Fortaleza', '2223', 'Loja 01', 'Edson Queiroz', '60811-341', '84987654321', 'zenir@example.com', 'http://www.zenir.com.br', 'u_zenir', 's_zenir', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

	 
INSERT INTO leilao (id, codigo, descricao, vendedor, inicio_previsto, created_at, updated_at)
VALUES
    (1, 1001, 'L: Clean Architecture: A Craftsman''s Guide to Software', 1, CURRENT_TIMESTAMP + INTERVAL '11 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (2, 1002, 'L: Design Patterns: Elements of Reusable Object-Oriented', 2, CURRENT_TIMESTAMP + INTERVAL '12 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (3, 1003, 'L: The Pragmatic Programmer: Your Journey to Mastery', 3, CURRENT_TIMESTAMP + INTERVAL '13 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (4, 1004, 'L: Refactoring: Improving the Design of Existing Code', 4, CURRENT_TIMESTAMP + INTERVAL '14 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (5, 1005, 'L: Code Complete: A Practical Handbook of Software', 5, CURRENT_TIMESTAMP + INTERVAL '15 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (6, 1006, 'L: Structure and Interpretation of Computer Programs', 6, CURRENT_TIMESTAMP + INTERVAL '16 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (7, 1007, 'L: Clean Architecture: A Craftsman''s Guide to Software', 7, CURRENT_TIMESTAMP + INTERVAL '17 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (8, 1008, 'L: Introduction to Algorithms', 8, CURRENT_TIMESTAMP + INTERVAL '18 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (9, 1009, 'L: Test Driven Development: By Example', 9, CURRENT_TIMESTAMP + INTERVAL '19 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (10, 1010, 'L: JavaScript: The Good Parts', 10, CURRENT_TIMESTAMP + INTERVAL '20 days', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


INSERT INTO lote (id, numero_lote, descricao, quantidade, valor_inicial, unidade, leilao, created_at, updated_at)
VALUES
    (1, 001, 'Lote 001', 15, 75.50, 'Clean Code: A Handbook of Agile Software Craftsmanship', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (2, 002, 'Lote 002', 20, 60.25, 'Design Patterns: Elements of Reusable Object-Oriented Software', 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (3, 003, 'Lote 003', 10, 45.75, 'The Pragmatic Programmer: Your Journey to Mastery', 3, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (4, 004, 'Lote 004', 18, 85.00, 'Refactoring: Improving the Design of Existing Code', 4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (5, 005, 'Lote 005', 12, 70.80, 'Code Complete: A Practical Handbook of Software Construction', 5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (6, 006, 'Lote 006', 23, 55.30, 'Structure and Interpretation of Computer Programs', 6, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (7, 007, 'Lote 007', 8, 90.20, 'Clean Architecture: A Craftsman''s Guide to Software Structure and Design', 7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (8, 008, 'Lote 008', 17, 42.60, 'Introduction to Algorithms', 8, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (9, 009, 'Lote 009', 21, 78.90, 'Test Driven Development: By Example', 9, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (10, 010, 'Lote 010', 13, 65.40, 'JavaScript: The Good Parts', 10, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


INSERT INTO comprador (empresa, leilao)
VALUES
    (1, 2),
    (2, 3),
    (3, 4),
    (4, 5),
    (5, 6),
    (6, 7),
    (7, 8),
    (8, 9),
    (9, 10),
    (10, 1);
