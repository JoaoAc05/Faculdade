import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import * as React from 'react';
import { Button, Text, View } from 'react-native';
import PageCep from './src/PageCep/Index.js'

function HomeScreen({ navigation }) {
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <Text>Home Screen</Text>
      <Button
      title="Ir para detalhes"
      onPress={() => navigation.navigate('Details')}
      />
      <Text> </Text>
      <Button
      title="Buscar CEP"
      onPress={() => navigation.navigate('CEP')}
      />
    </View>
    
  );
}

function DetailsScreen() {
  return (  
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <Text>Detail screen for navigate simulator</Text>
      <Text>Press button</Text>
      <Button 
      title="Voltar para Home"
      onPress={() => navigation.navigate('Home')}
      />
    </View>
  );
}

const Stack = createNativeStackNavigator();

function App(){
  return (
    <NavigationContainer>
      <Stack.Navigator initialRouteName='Home'>
        <Stack.Screen name="Home" component={HomeScreen} />
        <Stack.Screen name="Details" component={DetailsScreen} />
        <Stack.Screen name="CEP" component={PageCep} />
      </Stack.Navigator>
    </NavigationContainer>  
  );
}

export default App;