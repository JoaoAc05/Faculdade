import { createDrawerNavigator } from '@react-navigation/drawer';
import { NavigationContainer } from '@react-navigation/native';
import * as React from 'react';
import { Button, View } from 'react-native';

function HomeScreen({ navigation }) {
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <Button onPress={() => navigation.navigate('Shopping')} title="Fazer Compras" />  
        <br/>     
       <Button onPress={() => navigation.navigate('Carrinho')} title="Ver Carrinho" />
        <br/>
      <Button onPress={() => navigation.navigate('Favoritos')} title="Ver Favoritos" /> 
        <br/>
      <Button onPress={() => navigation.navigate('Notificacoes')} title="Ir para notificações" />
    </View>
  );
}

function ShoppingScreen({ navigation }) {
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <Button onPress={() => navigation.goBack()} title="Ir para home" />
    </View>
  );
}

function CarrinhoScreen({ navigation }) {
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <Button onPress={() => navigation.goBack()} title="Ir para home" />
    </View>
  );
}

function FavoritosScreen({ navigation }) {
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <Button onPress={() => navigation.goBack()} title="Ir para home" />
    </View>
  );
}
function NotificacoesScreen({ navigation }) {
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <Button onPress={() => navigation.goBack()} title="Ir para home" />
    </View>
  );
}

const Drawer = createDrawerNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Drawer.Navigator initialRouteName="Home">
        <Drawer.Screen name="Home" component={HomeScreen} />
        <Drawer.Screen name="Shopping" component={ShoppingScreen} />
        <Drawer.Screen name="Carrinho" component={CarrinhoScreen} />
        <Drawer.Screen name="Favoritos" component={FavoritosScreen} />
        <Drawer.Screen name="Notificacoes" component={NotificacoesScreen} />
      </Drawer.Navigator>
    </NavigationContainer>
  );
}