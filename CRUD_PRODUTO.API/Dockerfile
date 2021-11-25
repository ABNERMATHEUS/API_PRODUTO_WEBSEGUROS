#See https://aka.ms/containerfastmode to understand how Visual Studio uses this Dockerfile to build your images for faster debugging.

FROM mcr.microsoft.com/dotnet/aspnet:5.0 AS base
WORKDIR /app
EXPOSE 80

FROM mcr.microsoft.com/dotnet/sdk:5.0 AS build
WORKDIR /src
COPY ["CRUD_PRODUTO.API/CRUD_PRODUTO.API.csproj", "CRUD_PRODUTO.API/"]
RUN dotnet restore "CRUD_PRODUTO.API/CRUD_PRODUTO.API.csproj"
COPY . .
WORKDIR "/src/CRUD_PRODUTO.API"
RUN dotnet build "CRUD_PRODUTO.API.csproj" -c Release -o /app/build

FROM build AS publish
RUN dotnet publish "CRUD_PRODUTO.API.csproj" -c Release -o /app/publish

FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "CRUD_PRODUTO.API.dll"]