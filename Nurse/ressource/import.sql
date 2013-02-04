insert into t_authors(id_author, ssid, lastname, firstname, birthday, deathday) values (1, '1 28 02 75 123 456 78', 'Verne', 'Jules', '1828-02-08 00:00:00', '1905-03-24 00:00:00');
insert into t_authors(id_author, ssid, lastname, firstname, birthday) values (2, '1 65 04 93 123 456 78', 'Jardin', 'Alexandre', '1965-04-14 00:00:00');

insert into t_books(id_book, isbn, title, printedDate, id_author) values (1, '9782070365265', 'Les Trois Mousquetaires', '1844-01-01 00:00:00', 1);
insert into t_books(id_book, isbn, title, printedDate, id_author) values (2, '9782070365264', 'Voyage au centre de la Terre', '1864-11-25 00:00:00', 1);
insert into t_books(id_book, isbn, title, printedDate, id_author) values (3, '9782070365263', 'Vingt mille lieues sous les mers', '1870-6-20 00:00:00', 1);
insert into t_books(id_book, isbn, title, printedDate, id_author) values (4, '2246790204', 'Joyeux Noel', '2010-10-24 00:00:00', 2);