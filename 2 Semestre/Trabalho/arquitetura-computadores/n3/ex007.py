class Aluno:
    def __init__(self, matricula, nota):
        self.matricula = matricula
        self.nota = nota

def aloca_e_ordena_alunos(N):
    alunos = []

    for _ in range(N):
        matricula = int(input("Digite a matrícula do aluno: "))
        nota = float(input("Digite a nota do aluno: "))
        alunos.append(Aluno(matricula, nota))

    alunos_ordenados_nota = sorted(alunos, key=lambda x: x.nota)
    print("\nAlunos ordenados por nota final:")
    for aluno in alunos_ordenados_nota:
        print(f"Matrícula: {aluno.matricula}, Nota: {aluno.nota}")

    alunos_ordenados_matricula = sorted(alunos, key=lambda x: x.matricula)
    print("\nAlunos ordenados por número de matrícula:")
    for aluno in alunos_ordenados_matricula:
        print(f"Matrícula: {aluno.matricula}, Nota: {aluno.nota}")

    return alunos

N = int(input("Digite a quantidade de alunos: "))
alunos_ordenados = aloca_e_ordena_alunos(N)