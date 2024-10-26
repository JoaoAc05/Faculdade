-- CreateTable
CREATE TABLE "Produtos" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "nome" TEXT NOT NULL,
    "descricao" TEXT NOT NULL,
    "vlrUnit" REAL NOT NULL,
    "status" INTEGER NOT NULL DEFAULT 0
);
