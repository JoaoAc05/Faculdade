import axios from 'axios';
import { StatusBar } from 'expo-status-bar';
import { useEffect, useState } from 'react';
import { Button, StyleSheet, Text, TextInput, View } from 'react-native';

export default function App() {
  const [MeuCep, setMeuCep] = useState("");
  const [MeuEnd, setMeuEnd] = useState([]);

  useEffect(() => {
    
  }, [MeuEnd]);

  const onChangeCEP = (cep) => {
    setMeuCep(cep);
  }

  async function getCep() {
    setMeuEnd([]);

    try {
      await axios
        .get(`https://viacep.com.br/ws/${ MeuCep }/json/`, {
          headers: {
            "Content-Type": "application/json",
          },
        })
        .then((response) => {
          console.log(response);
          setMeuEnd(response.data)
        })
        .catch((error) => {
          console.log(error);
        });
    } catch (erro) {
      console.log(erro);
    }
  }

  
  return (
    <View style={styles.container}>
      <Text>Digite seu cep:</Text>
      <TextInput
        style={styles.input}
        onChangeText={CEP => onChangeCEP(CEP)}
        value={MeuCep}
        placeholder="CEP"
        keyboardType="numeric"
        maxLength={8}
      />

      <Button
        title="Pesquisar CEP"
        onPress={() => getCep() }
      />

      <Text style={{ marginTop: 10 }}>Meu endereço é: { MeuEnd.logradouro }</Text>
      <Text style={{ marginTop: 10 }}>Meu bairo é: { MeuEnd.bairro }</Text>
      <Text style={{ marginTop: 10 }}>Minha cidade é: { MeuEnd.localidade }</Text>
      <Text style={{ marginTop: 10 }}>Meu estado é: { MeuEnd.uf }</Text>
      <StatusBar style="auto" />
    </View>
  );  
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  input: {
    height: 40,
    width:100,
    margin: 12,
    borderWidth: 1,
    padding: 10,
  }
});

