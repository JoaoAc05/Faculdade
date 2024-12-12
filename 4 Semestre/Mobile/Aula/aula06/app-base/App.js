import React from 'react';
import StackRoutes from './src/stackRoutes.js';

import { registerRootComponent } from 'expo';

export default function App() {
  return (
    <StackRoutes />
  );
}

registerRootComponent(App);