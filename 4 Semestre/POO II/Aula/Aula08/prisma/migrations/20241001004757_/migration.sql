/*
  Warnings:

  - A unique constraint covering the columns `[id_produto]` on the table `Estoque` will be added. If there are existing duplicate values, this will fail.

*/
-- CreateIndex
CREATE UNIQUE INDEX "Estoque_id_produto_key" ON "Estoque"("id_produto");
