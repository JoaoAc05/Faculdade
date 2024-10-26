-- CreateTable
CREATE TABLE "Estoque" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "id_produto" INTEGER NOT NULL,
    "quantidade" INTEGER NOT NULL,
    "dt_atl" DATETIME NOT NULL,
    "status" INTEGER NOT NULL DEFAULT 0,
    CONSTRAINT "Estoque_id_produto_fkey" FOREIGN KEY ("id_produto") REFERENCES "Produtos" ("id") ON DELETE RESTRICT ON UPDATE CASCADE
);
